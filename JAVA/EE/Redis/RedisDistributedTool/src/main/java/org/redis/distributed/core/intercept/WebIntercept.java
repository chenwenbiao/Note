package org.redis.distributed.core.intercept;

import org.redis.distributed.core.annotation.ControllerLimit;
import org.redis.distributed.core.limit.RedisLimit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class WebIntercept extends WebMvcConfigurerAdapter {

    private static Logger logger = LoggerFactory.getLogger(WebIntercept.class);

    @Autowired
    private RedisLimit redisLimit;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new CustomInterceptor()).addPathPatterns("/**");
    }

    private class CustomInterceptor extends HandlerInterceptorAdapter {

        @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
            if (redisLimit == null) {
                throw new NullPointerException("redisLimit is null!!!");
            }

            if (handler instanceof HandlerMethod) {
                HandlerMethod method = (HandlerMethod) handler;
                ControllerLimit annotation = method.getMethodAnnotation(ControllerLimit.class);
                if (annotation == null) {
                    // 跳过限流
                    return true;
                }

                boolean limit = redisLimit.limit();
                if (!limit) {
                    logger.warn("request has been limited!!");
                    response.sendError(500, "request limited!!");
                    return false;
                }
            }

            return true;
        }
    }

}
