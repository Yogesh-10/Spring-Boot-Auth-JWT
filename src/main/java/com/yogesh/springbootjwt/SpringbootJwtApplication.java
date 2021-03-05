package com.yogesh.springbootjwt;

import com.yogesh.springbootjwt.entity.User;
import com.yogesh.springbootjwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringbootJwtApplication {
	@Autowired
	private UserRepository repository;

	@PostConstruct
	public void initUsers(){
		List<User> users = Stream.of(
				new User(1,"oops","password","user1.com"),
				new User(2,"oops1","password1","user2.com"),
				new User(3,"oops2","password2","user3.com")
		).collect(Collectors.toList());
		repository.saveAll(users);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJwtApplication.class, args);
	}

}
