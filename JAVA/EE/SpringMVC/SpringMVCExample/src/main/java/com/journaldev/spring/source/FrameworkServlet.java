package com.journaldev.spring.source;

import org.springframework.web.context.ConfigurableWebApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.HttpServletBean;

import javax.servlet.ServletException;

public class FrameworkServlet extends HttpServletBean {

    WebApplicationContext webApplicationContext;

    protected final void initServletBean() throws ServletException {
        getServletContext().log("Initializing Spring FrameworkServlet '" + getServletName() + "'");

        /*if (this.logger.isInfoEnabled()) {
            this.logger.info("FrameworkServlet '" + getServletName() + "': initialization started");
        }*/

        long startTime = System.currentTimeMillis();
        try {
            // initWebApplicationContext方法中，创建了Servlet WebApplicationContext实例
            this.webApplicationContext = initWebApplicationContext();

            // initFrameworkServlet();
        } catch (Exception ex) {
            //this.logger.error("Context initialization failed", ex);
            throw ex;
        }

        /*if (this.logger.isInfoEnabled()) {
            long elapsedTime = System.currentTimeMillis() - startTime;
            this.logger.info("FrameworkServlet '" + getServletName() + "': initialization completed in " +
                    elapsedTime + " ms");
        }*/

    }

    // FrameworkServlet的另一个方法initWebApplicationContext()，
    // 来真正创建WebApplicationContext实例
    protected WebApplicationContext initWebApplicationContext() {
        // 1 通过工具类WebApplicationContextUtils来获取Root WebApplicationContext
        // 其内部以”org.springframework.web.context.WebApplicationContext.ROOT”为
        // key从ServletContext中查找WebApplicationContext实例作为rootContext
        WebApplicationContext rootContext =
                WebApplicationContextUtils.getWebApplicationContext(getServletContext());
        WebApplicationContext wac = null;

        //2、在我们的案例中是通过web.xml配置的DispatcherServlet，
        // 此时webApplicationContext为null，因此不会进入以下代码块
        if (this.webApplicationContext != null) {
            // A context instance was injected at construction time -> use it
            wac = this.webApplicationContext;
            if (wac instanceof ConfigurableWebApplicationContext) {
                ConfigurableWebApplicationContext cwac = (ConfigurableWebApplicationContext) wac;
                if (!cwac.isActive()) {
                    // The context has not yet been refreshed -> provide services such as
                    // setting the parent context, setting the application context id, etc
                    if (cwac.getParent() == null) {
                        // The context instance was injected without an explicit parent -> set
                        // the root application context (if any; may be null) as the parent
                        cwac.setParent(rootContext);
                    }
                    //configureAndRefreshWebApplicationContext(cwac);
                }
            }
        }

        //3 经过第二步，wac依然为null，此时尝试根据FrameServlet的contextAttribute 字段的值，
        // 从ServletContext中获取Servlet WebApplicationContext实例，
        // 在我们的案例中，contextAttribute值为空，因此这一步过后，wac依然为null
        if (wac == null) {

            //wac = findWebApplicationContext();
        }

        //4 开始真正的创建Servlet WebApplicationContext，并将rootContext设置为parent
        if (wac == null) {
            // No context instance is defined for this servlet -> create a local one
            //wac = createWebApplicationContext(rootContext);
        }

        return wac;
    }
}