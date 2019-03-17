package com.itranswarp.springcloud.api.rest;

import java.util.List;
import java.util.UUID;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itranswarp.springcloud.api.bean.UserReq;
import com.itranswarp.springcloud.api.domain.User;

@RestController
@RequestMapping("/api")
@Transactional
public class UserController {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@PostConstruct
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

	@PostMapping("/users")
	public User createUser(@RequestBody UserReq req) {
		String id = randomString();
		Long now = System.currentTimeMillis();
		jdbcTemplate.update(
				"INSERT INTO user (id, email, name, gender, createdAt, updatedAt) VALUES (?, ?, ?, ?, ?, ?)", // SQL
				id, req.getEmail(), req.getName(), req.isGender(), now, now);
		return getUser(id);
	}

	@GetMapping("/users")
	public List<User> getUsers() {
		return jdbcTemplate.query("SELECT * FROM user ORDER BY createdAt", new BeanPropertyRowMapper<>(User.class));
	}

	@GetMapping("/users/{id}")
	public User getUser(@PathVariable("id") String id) {
		return jdbcTemplate.queryForObject("SELECT * FROM user WHERE id=?", new BeanPropertyRowMapper<>(User.class),
				id);
	}

	@PutMapping("/users/{id}")
	public User updateUser(@PathVariable("id") String id, @RequestBody UserReq req) {
		jdbcTemplate.update("UPDATE user SET email=?, name=?, gender=?, updatedAt=? WHERE id=?", // SQL
				req.getEmail(), req.getName(), req.isGender(), System.currentTimeMillis(), id);
		return getUser(id);
	}

	private String randomString() {
		return UUID.randomUUID().toString();
	}
}
