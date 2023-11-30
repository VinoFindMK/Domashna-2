package com.ukim.finki.domashna2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class Domashna2Application {

	public static void main(String[] args) {
		SpringApplication.run(Domashna2Application.class, args);

	}
}