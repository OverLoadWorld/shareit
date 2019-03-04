package com.nearu.shareit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ShareitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShareitApplication.class, args);
	}

	@RequestMapping("/hi")
	public String hi() {
		return "u see see u can do what?";
	}
}
