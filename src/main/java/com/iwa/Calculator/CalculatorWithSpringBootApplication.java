package com.iwa.Calculator;

import com.iwa.Calculator.Operation.Divide;
import com.iwa.Calculator.Operation.Minus;
import com.iwa.Calculator.Operation.Multiply;
import com.iwa.Calculator.Operation.Sum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CalculatorWithSpringBootApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(CalculatorWithSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) {
		double a = 10;
		double b = 5;

		System.out.println("Suma: " + sum.operation(a, b));
		System.out.println("Resta: " + minus.operation(a, b));
		System.out.println("Multiplicación: " + multiply.operation(a, b));
		System.out.println("División: " + divide.operation(a, b));


	}

	@Bean
	public CommandLineRunner listarBeans(ApplicationContext context) {
		return args -> {
			String paqueteBase = "com.baeldung";  // Cambia esto al paquete base de tu proyecto

			System.out.println("Beans registrados en el contexto de Spring por el usuario:");
			for (String beanName : context.getBeanDefinitionNames()) {
				// Obtener la clase del Bean
				Class<?> beanType = context.getType(beanName);

				// Filtrar solo los Beans que pertenecen al paquete base del usuario
				if (beanType != null && beanType.getPackageName().startsWith(paqueteBase)) {
					System.out.println(beanName + " -> " + beanType.getName());
				}
			}
		};
	}
}