package com.ochabmateusz.cres.cresnoteservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
//@EnableEurekaClient
@EnableJpaAuditing
public class CresNoteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CresNoteServiceApplication.class, args);
	}
}
