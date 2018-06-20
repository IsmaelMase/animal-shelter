package com.proyecto.perros.refugioanimal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class RefugioAnimalApplication {

	public static void main(String[] args) {
		SpringApplication.run(RefugioAnimalApplication.class, args);
	}
}
