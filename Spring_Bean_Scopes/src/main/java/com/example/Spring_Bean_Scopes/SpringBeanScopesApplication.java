package com.example.Spring_Bean_Scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringBeanScopesApplication {

	public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        SingletonBean singleton1 = context.getBean(SingletonBean.class);
        SingletonBean singleton2 = context.getBean(SingletonBean.class);

        System.out.println("Are singleton beans the same? " + (singleton1 == singleton2));

        PrototypeBean prototype1 = context.getBean(PrototypeBean.class);
        PrototypeBean prototype2 = context.getBean(PrototypeBean.class);

        System.out.println("Are prototype beans the same? " + (prototype1 == prototype2));
        
        Clients clients = new Clients("Sonu ", 73 , "Mumbai");
        System.out.println("INFO :"+clients.getName()+" : "+ clients.getAge()+ " : "+clients.getCity());
        
        clients.setCity("Prayagraj");
        System.out.println("INFO :"+clients.getName()+" : "+ clients.getAge()+ " : "+clients.getCity());
        
    }
}
