package com.example.examendiagnostico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.examendiagnostico")
public class ExamendiagnosticoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamendiagnosticoApplication.class, args);
	}

}
