package com.nearu.shareit;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootApplication
@RestController
@Slf4j
public class ShareitApplication implements CommandLineRunner {

	@Autowired
	private DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(ShareitApplication.class, args);
	}



	@RequestMapping("/hi")
	public String hi() {
		return "u see see u can do what?";
	}

	@Override
	public void run(String... args) throws Exception {
		showConnection();
		
	}

	private void showConnection() throws SQLException {
		log.info("shit ----> "+dataSource.toString());
		Connection con = dataSource.getConnection();
		log.info("shit ----> "+con.toString());
		con.close();
	}
}
