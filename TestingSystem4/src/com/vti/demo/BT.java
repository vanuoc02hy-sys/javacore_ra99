package com.vti.demo;

import com.vti.entity.Student;

public class BT {
    public void m1() {
        System.out.println("Từ class con");
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setPoint(6);

        student.printInfo();
    }


}

class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;
}

