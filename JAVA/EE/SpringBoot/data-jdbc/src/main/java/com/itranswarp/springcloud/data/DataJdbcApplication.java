package com.itranswarp.springcloud.data;

import java.util.List;
import java.util.UUID;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itranswarp.springcloud.data.domain.User;
import com.itranswarp.springcloud.data.request.UserReq;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Spring Boot Application using Spring Data Jdbc.
 */
@SpringBootApplication
@EnableSwagger2
@RestController
public class DataJdbcApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DataJdbcApplication.class, args);
	}

	@Autowired
	JdbcTemplate jdbcTemplate;

	@PostConstruct// Spring bean对象构造完后调用.
	public void init() {
		jdbcTemplate.execute("DROP TABLE IF EXISTS user");
		jdbcTemplate.execute("CREATE TABLE user (" //
				+ "id VARCHAR(50) NOT NULL," //
				+ "email VARCHAR(50) NOT NULL," //
				+ "name VARCHAR(50) NOT NULL," //
				+ "gender BOOLEAN NOT NULL," //
				+ "createdAt BIGINT NOT NULL," //
				+ "updatedAt BIGINT NOT NULL," //
				+ "PRIMARY KEY (id))");
		for (int i = 0; i < 25; i++) {
			UserReq req = new UserReq();
			req.setEmail(randomString() + "@test.io");
			req.setName("Mr " + randomString());
			req.setGender(randomString().hashCode() % 2 == 0);
			createUser(req);
		}
	}

	@PostMapping("/api/users")
	public User createUser(@RequestBody UserReq req) {
		String id = randomString();
		Long now = System.currentTimeMillis();
		jdbcTemplate.update(
				"INSERT INTO user (id, email, name, gender, createdAt, updatedAt) VALUES (?, ?, ?, ?, ?, ?)", // SQL
				id, req.getEmail(), req.getName(), req.isGender(), now, now);
		return getUser(id);
	}

	@GetMapping("/api/users")
	public List<User> getUsers() {
		return jdbcTemplate.query("SELECT * FROM user ORDER BY createdAt", new BeanPropertyRowMapper<>(User.class));
	}

	@GetMapping("/api/users/{id}")
	public User getUser(@PathVariable("id") String id) {
		return jdbcTemplate.queryForObject("SELECT * FROM user WHERE id=?", new BeanPropertyRowMapper<>(User.class),
				id);
	}

	@PutMapping("/api/users/{id}")
	public User updateUser(@PathVariable("id") String id, @RequestBody UserReq req) {
		jdbcTemplate.update("UPDATE user SET email=?, name=?, gender=?, updatedAt=? WHERE id=?", // SQL
				req.getEmail(), req.getName(), req.isGender(), System.currentTimeMillis(), id);
		return getUser(id);
	}

	@DeleteMapping("/api/users/{id}")
	public boolean deleteUser(@PathVariable("id") String id) {
		int n = jdbcTemplate.update("DELETE FROM user WHERE id=?", id);
		return n == 1;
	}

	private String randomString() {
		return UUID.randomUUID().toString();
	}

	@Bean
	public Docket userApi() {
		return new Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.regex("^/api/.*$")).build();
	}
}
