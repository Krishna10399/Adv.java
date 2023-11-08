package com.example.HelloSpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class HelloSpringAppApplication {

	 public static void main(String[] args) {
	        // Create an application context using annotation-based configuration
	        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

	        // Retrieve the HelloWorld bean from the context
	        HelloWorld helloWorld = context.getBean(HelloWorld.class);

	        // Call the printMessage method to print "Hello, World!"
	        helloWorld.printMessage();
	    }
}
