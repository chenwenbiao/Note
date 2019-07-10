package com.itranswarp.springcloud.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot Application using Spring Cache.
 */
@SpringBootApplication
@RestController
@EnableCaching// 开启基于注解的缓存
public class CacheApplication {

	@GetMapping("/hi/{name}")
	public String hi(@PathVariable("name") String name) throws Exception {
		return slowHi(name);
	}

	@Cacheable("names")// 主要针对方法配置，能够根据方法的请求参数对其结果进行缓存
	@GetMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name) throws Exception {
		return slowHello(name);
	}

	@CacheEvict("names")//清空缓存
	@GetMapping("/remove/{name}")
	public boolean unhello(@PathVariable("name") String name) throws Exception {
		return true;
	}

	String slowHi(String name) throws Exception {
		Thread.sleep(3000);
		return "Hi, " + name + "!";
	}

	String slowHello(String name) throws Exception {
		Thread.sleep(3000);
		return "Hello, " + name + "!";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(CacheApplication.class, args);
	}

}
