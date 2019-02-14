package com.journaldev.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpStatus;
import com.journaldev.spring.config.AppConfig;
import com.journaldev.spring.config.PersonClient;
import com.journaldev.spring.model.Person;

// Spring RestTemplate Test Class

// Spring RestTemplate提供了一种测试RESTful Web Service的便捷方式。

// 下面的类显示了如何在Spring方式中使用RestTemplate方法。

// 执行上述程序之前和之后的Web服务数据库表数据会发生变化

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		PersonClient client = applicationContext.getBean(PersonClient.class);

		System.out.println("Getting list of all people:");

		for (Person p : client.getAllPerson()) {
			System.out.println(p);
		}

		System.out.println("\nGetting person with ID 2");

		Person personById = client.getById(2L);

		System.out.println(personById);

		System.out.println("Adding a Person");
		Person p = new Person();
		p.setAge(50);
		p.setFirstName("David");
		p.setLastName("Blain");
		HttpStatus status = client.addPerson(p);
		System.out.println("Add Person Response = " + status);

		applicationContext.close();
	}
}
