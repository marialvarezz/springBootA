package com.eoi.springboot;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;





@SpringBootApplication
@RestController
public class MySpringBootAplication {


		public static void main(String[] args) {
			SpringApplication.run(MySpringBootAplication.class, args);
		}



		@GetMapping("/")
		String helloMain() {
			return "Main class";
		}

	}





