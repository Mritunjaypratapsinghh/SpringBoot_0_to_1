package com.mritunjay.week1Introduction.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main entry point for the Spring Boot application.
 * Implements `CommandLineRunner` to execute code on startup.
 */
@SpringBootApplication
public class IntroductionToSpringBootApplication implements CommandLineRunner {

	@Autowired
	Apple obj;  // First Apple instance

	@Autowired
	Apple obj2;  // Second Apple instance

	@Autowired //Field Dependency Injection
	DBService dbService;  // Injecting the appropriate database service

	/**
	 * Main method to start the Spring Boot application.
	 *
	 * @param args Command-line arguments.
	 */
	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringBootApplication.class, args);
	}

	/**
	 * Runs after the application startup.
	 * It demonstrates dependency injection and prints data from `DBService`.
	 *
	 * @param args Command-line arguments.
	 * @throws Exception if an error occurs.
	 */
	@Override
	public void run(String... args) throws Exception {
		obj.eatApple();
		obj2.eatApple();

		// Printing hashcodes to verify that different instances are created
		System.out.println("HashCode of obj: " + obj.hashCode());
		System.out.println("HashCode of obj2: " + obj2.hashCode());

		// Fetching data from the active database configuration
		System.out.println("Database Output: " + dbService.getData());
	}
}
