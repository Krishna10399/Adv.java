package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AoPrApplication {

	 public static void main(String[] args) {
	        AnnotationConfigApplicationContext context =
	            new AnnotationConfigApplicationContext(AppConfig.class);

	        MyService myService = context.getBean(MyService.class);
	        System.out.println(myService.greet("Krishna jha"));
	        System.out.println(myService.add(5, 3));

	        context.close();
	    }

}
