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
	CakeBaker cakeBaker;
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
	 * It demonstrates dependency injection and run method bakeCake from CakeBaker`.
	 *
	 * @param args Command-line arguments.
	 * @throws Exception if an error occurs.
	 */
	@Override
	public void run(String... args) throws Exception {
		System.out.println("cake: " + cakeBaker.bakeCake("Chocolate"));
	}
}
