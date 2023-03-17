package com.eoi.springboot;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;


/**
 * The type My spring boot aplication.
 */
@SpringBootApplication
@RestController
public class MySpringBootAplication {


	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
			SpringApplication.run(MySpringBootAplication.class, args);
		}


	/**
	 * Hello main string.
	 *
	 * @return the string
	 */
	@GetMapping("/")
		String helloMain() {
			return "Main class";
		}

	}





