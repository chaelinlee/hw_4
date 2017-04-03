package com.example.leechaelin.hw_4;

/**
 * Created by leechaelin on 2017. 3. 30..
 */

public class data {
    String tablename,time,membership;
    int spa,pizza;
    Double price;

    public data(String tablename,String time,int spa,int pizza,String membership,Double price){
        this.tablename= tablename;
        this.time = time;
        this.spa = spa;
        this.pizza = pizza;
        this.membership = membership;
        this.price = price;
    }
}
