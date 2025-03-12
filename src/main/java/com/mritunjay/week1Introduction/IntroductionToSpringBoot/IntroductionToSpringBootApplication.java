package com.mritunjay.week1Introduction.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // Marks this as a Spring Boot application
public class IntroductionToSpringBootApplication implements CommandLineRunner {

	@Autowired  // Injects the Apple bean
	Apple obj;  // Since we use "prototype" scope, a new object is created each time

	@Autowired  // Injects another Apple bean instance
	Apple obj2;

	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		obj.eatApple();
		obj2.eatApple();

		// Printing hashcodes to verify different instances are created
		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());
	}
}
