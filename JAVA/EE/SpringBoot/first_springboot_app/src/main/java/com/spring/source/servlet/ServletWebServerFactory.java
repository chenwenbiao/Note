package com.spring.source.servlet;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.web.server.WebServer;
import org.springframework.boot.web.servlet.ServletContextInitializer;

// 是一个工厂接口，用于生产WebServer

/**
 * ServletWebServerFactory是在ServletWebServerFactoryAutoConfiguration这个自动化配置类中被注册到Spring容器中的
 * (前期是Spring容器中不存在ServletWebServerFactoryAutoConfiguration类型的bean，
 * 可以自己定义ServletWebServerFactoryAutoConfiguration类型的bean)：
 */
@FunctionalInterface
public interface ServletWebServerFactory {

    // 获得一个已经配置好的内置Servlet容器，但是这个容器还没有监听端口。
    // 需要手动调用内置Servlet容器的start方法监听端口
    // 参数是一群ServletContextInitializer，Servlet容器启动的时候会遍历这
    // 些ServletContextInitializer，并调用onStartup方法
    WebServer getWebServer(ServletContextInitializer... initializers);

}
