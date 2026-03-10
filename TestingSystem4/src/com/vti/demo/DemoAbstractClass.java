package com.vti.demo;

public abstract class DemoAbstractClass {
    public int accountId;

    public DemoAbstractClass(int id) {
    }

    abstract String inputDate();

    abstract int plus(int a, int b);

    void test(){
        System.out.println("abc");
    }
}
