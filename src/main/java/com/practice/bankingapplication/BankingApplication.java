package com.practice.bankingapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@SpringBootApplication

// Add this when you have to programmatically configure our own DataSource implementation
// (make sure to delete the database configurations from application.properties file)
// @Configuration


public class BankingApplication {

	// Add this when you have to programmatically configure our own DataSource implementation.
//	@Bean
//	public DataSource dataSource() {
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//		dataSource.setUrl("jdbc:mysql://localhost:3306/banking_app");
//		dataSource.setUsername( "<db_username>" );
//		dataSource.setPassword( "<db_password>");
//		return dataSource;
//	}

	public static void main(String[] args) {
		SpringApplication.run(BankingApplication.class, args);
	}

}
