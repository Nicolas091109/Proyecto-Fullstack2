package com.envios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.envios"})
public class EnviosApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnviosApiApplication.class, args);
	}
	

}