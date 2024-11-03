package com.iwa.Calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorWithSpringBootApplication implements CommandLineRunner {

	@Autowired
	private Sum sum;

	@Autowired
	private Minus minus;

	@Autowired
	private Multiply multiply;

	@Autowired
	private Divide divide;

	public static void main(String[] args) {
		SpringApplication.run(CalculatorWithSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) {
		double a = 10;
		double b = 5;

		System.out.println("Suma: " + sum.operar(a, b));
		System.out.println("Resta: " + minus.operar(a, b));
		System.out.println("Multiplicación: " + multiply.operar(a, b));
		System.out.println("División: " + divide.operar(a, b));
	}
}