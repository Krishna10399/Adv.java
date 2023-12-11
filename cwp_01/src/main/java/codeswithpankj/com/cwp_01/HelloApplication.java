package codeswithpankj.com.cwp_01;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class HelloApplication extends Application {

    public static void main(String[] args) {
        HelloResource data1 = new HelloResource("sonu",25,4.5f);
        HelloResource data2 = new HelloResource("yog",21,5.5f);
        System.out.println("Your Name is : " + data1.getName());
        System.out.println("Your Age is : " + data1.getAge());
        System.out.println("Your Height is : " + data1.getHeight());
        data1 = data2;


        System.out.println("Your Name is : " + data1.getName());
        System.out.println("Your Age is : " + data1.getAge());
        System.out.println("Your Height is : " + data1.getHeight());

        // generatin food's object and calling them


        Product_handle productHandle = new Product_handle();
        productHandle.setSize(4);
        String data[] = {"Samosa","pav","Fafda","jalebi"};
        productHandle.setFood(data);
        productHandle.getFood();



        // Food_Holder Class
        Set<String> fdata = new HashSet<>();

        fdata.add(" Black Samosa ");
        fdata.add(" Black Samosa ");
        fdata.add(" Black Samosa1 ");
        fdata.add(" Black Samosa1 ");

        Food_holder fd = new Food_holder(fdata);
        //System.out.println(fd.getFood());


        fd.getAllFood();

    }



}
