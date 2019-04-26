package com.tektutorial.spring.boot.profile.tektutorialspringprofile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.tektutorial.*")
public class TektutorialSpringProfileApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(TektutorialSpringProfileApplication.class, args);
	}

}
