package codeswithpankj.com.cwp_01;

public class Product_handle {


    //  Multiple Data Binding using Array
    int size;

    String food[] = new String[size];


    // Now generate Getters and Setters


    public void setSize(int size) {
        this.size = size;
    }

    public void getFood() {
        for (String fooddata:food
             )
        {
            System.out.println(fooddata);

        }
    }

    public void setFood(String[] food) {
        this.food = food;
    }
}
