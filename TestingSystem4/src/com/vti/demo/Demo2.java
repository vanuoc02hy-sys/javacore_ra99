package com.vti.demo;

public class Demo2 {
}

interface A {
    void method_1();
}

interface B extends A {
    void method_2();
}

class C implements B {

    @Override
    public void method_1() {

    }

    @Override
    public void method_2() {

    }

    public void method_2(int a) {

    }
}