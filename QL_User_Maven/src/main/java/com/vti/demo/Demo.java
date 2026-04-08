package com.vti.demo;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.price = 200;
        double newPrice =100;
    }
}

 class Parent{
    float price;
    void test(){
    }
}

class Child extends Date {
    @Override
    public int getYear() {
        return 40;
    }

}