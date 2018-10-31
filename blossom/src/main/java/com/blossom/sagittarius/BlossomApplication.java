package com.blossom.sagittarius;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.blossom.sagittarius.dao.UserDao;

@SpringBootApplication
public class BlossomApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlossomApplication.class, args);
	}
}
