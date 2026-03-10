package com.vti.demo;

public class Dog implements Animal{
    @Override
    protected void sound() {
        System.out.println("Go Go");
    }
}
