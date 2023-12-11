package codeswithpankj.com.cwp_01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Food_holder {


    Set<String> food = new HashSet<>();

    public Food_holder(Set<String> food) {
        this.food = food;
    }

    public Set<String> getFood() {
        return food;
    }
    public  void getAllFood()
    {
        for (String food_d : food
             )
        {
            System.out.println(" - "+food_d);
        }
    }
}
