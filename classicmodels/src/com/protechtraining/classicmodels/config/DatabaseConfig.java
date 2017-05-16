package com.protechtraining.classicmodels.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DatabaseConfig {

	private static final String DATABASE_DRIVER = "org.h2.Driver";
	private static final String DATABASE_PASSWORD = "";
	private static final String DATABASE_URL = "jdbc:h2:file:///c:/classfiles/workspace/classicmodelsdb";
	private static final String DATABASE_USERNAME = "sa";

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName(DATABASE_DRIVER);
		dataSource.setUrl(DATABASE_URL);
		dataSource.setUsername(DATABASE_USERNAME);
		dataSource.setPassword(DATABASE_PASSWORD);

		return dataSource;
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}
}
