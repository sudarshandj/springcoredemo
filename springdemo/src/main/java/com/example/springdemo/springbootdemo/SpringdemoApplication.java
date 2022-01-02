package com.example.springdemo.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
//@ComponentScan
public class SpringdemoApplication {

	public static void main(String[] args) {
		//System.out.println("Welcome to spring boot");
		ConfigurableApplicationContext context = SpringApplication.run(SpringdemoApplication.class, args);
		/*Alien alien = context.getBean(Alien.class);
		alien.show();

		Alien alien1 = context.getBean(Alien.class);
		alien1.show();*/

		/*Alien alien1 = context.getBean(Alien.class);
		alien1.show();*/
	}

}
