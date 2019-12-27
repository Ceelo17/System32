package com.marcelo.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
<<<<<<< HEAD
@ComponentScan
=======
@ComponentScan()
>>>>>>> 163f7e667c8b2f38b11dfda29cc7b2f0523ef9f8
public class System32Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(System32Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder createSpringApplicationBuilder() {
		// TODO Auto-generated method stub
		return super.createSpringApplicationBuilder();
	}

}
