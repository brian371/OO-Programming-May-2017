package com.protechtraining.classicmodels.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@ComponentScan(basePackages = {"com.protechtraining.classicmodels.patterns",
		"com.protechtraining.classicmodels.dao"
})
public class CommandLineConfig {

}
