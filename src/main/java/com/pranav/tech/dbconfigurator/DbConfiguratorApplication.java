package com.pranav.tech.dbconfigurator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DbConfiguratorApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DbConfiguratorApplication.class, args);
	
//		Content data = context.getBean(Content.class);
//		System.out.println(data);
	}

}
