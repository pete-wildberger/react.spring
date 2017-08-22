package com.javareact.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReactAndSpringDataRestApplication {

	public static void main(String[] args) {
    System.getProperties().put( "server.port", 2017 );
		SpringApplication.run(ReactAndSpringDataRestApplication.class, args);
	}
}
