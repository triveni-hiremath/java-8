package com.java8.features.concepts;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConceptsApplication {

	public static void main(String[] args) {
		System.out.println("hello mvn");
		SpringApplication.run(ConceptsApplication.class, args);
	}

}
