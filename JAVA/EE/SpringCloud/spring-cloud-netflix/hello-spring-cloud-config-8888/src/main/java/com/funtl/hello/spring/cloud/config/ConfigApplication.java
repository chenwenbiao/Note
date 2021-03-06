package com.funtl.hello.spring.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 浏览器端访问：http://localhost:8888/config-client/dev/master
 * 这个url的意思是我要访问对应仓库的 master分支下的respo目录下的: config-client-dev文件.
 * dev是相当于是指明开发环境的配置文件.
 *
 * 附：HTTP 请求地址和资源文件映射
 * http://ip:port/{application}/{profile}[/{label}]
 * http://ip:port/{application}-{profile}.yml
 * http://ip:port/{label}/{application}-{profile}.yml
 * http://ip:port/{application}-{profile}.properties
 * http://ip:port/{label}/{application}-{profile}.properties
 *
 * http://localhost:8888/config-client/dev/master
 * http://localhost:8888/config-client-dev.yml
 * http://localhost:8888/master/config-client-dev.yml
 * http://localhost:8888/config-client-dev.properties
 * http://localhost:8888/master/config-client-dev.properties
 */
@SpringBootApplication
// 通过注解 @EnableEurekaClient 表明自己是一个 Eureka Client.
// 说明在配置文件中,要把当前服务注册到eureka服务端,说明这是一个服务提供者.能够被其他服务消费者在eureka上发现.
@EnableEurekaClient
// 通过 @EnableConfigServer 注解表明这是一个Spring Cloud Config Server.
@EnableConfigServer
public class ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }

}
