package codeswithpankj.com.cwp_01;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

//@Path("/hello-world")
public class HelloResource {
  /* @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }*/

    String name;
    int age;
    float height;

    public HelloResource(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }
}

