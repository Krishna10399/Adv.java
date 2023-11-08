package com.example.Spring_Bean_Scopes;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
	//Clients clients = new Clients("Suraj", 32, "Pune");
	

	public SingletonBean() {
        System.out.println("SingletonBean instance created.");
       // System.out.println("Name : "+clients.getName());
        //System.out.println("Age : "+clients.getAge());
        //System.out.println("City : "+clients.getCity());
    }
}
