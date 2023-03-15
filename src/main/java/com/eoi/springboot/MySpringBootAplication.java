package com.eoi.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MySpringBootAplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootAplication.class, args);
	}



	@RequestMapping("/")
	String hellow(){
		return "Hello world!";
	}
	@RequestMapping("/hola")
	String hola(){
		return "Hola mundo!";
	}

	@RequestMapping("/mimedicacion")
	String mimedicacion(){
		return "Tomate las pastillas!";
	}

}
