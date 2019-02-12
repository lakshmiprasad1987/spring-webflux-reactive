package com.bp.reactive.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.bp.reactive.*"})
public class SpringBootReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootReactiveApplication.class, args);
	}

}

