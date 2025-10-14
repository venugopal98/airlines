package com.vp.airlines;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class AirlinesApplication {
	public static void main(String[] args) {
		SpringApplication.run(AirlinesApplication.class, args);
	}
}
