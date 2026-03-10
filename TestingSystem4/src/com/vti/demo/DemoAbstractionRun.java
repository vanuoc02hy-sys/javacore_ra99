package com.vti.demo;

public class DemoAbstractionRun {
    public static void main(String[] args) {
//        Animal dog =new Animal() {
//            @Override
//            void sound() {
//                System.out.println("go go");
//            }
//        };
//
//        Animal cat =new Animal() {
//            @Override
//            void sound() {
//                System.out.println("meo meow");
//            }
//        };

        // Sử dụng 1 đối tượng con đã triển khai các method
        // trừu tượng trên
        Animal cat_2 = new Cat();
        cat_2.sound();
//        cat_2.method_1();

        Animal dog = new Dog();
        dog.sound();
    }
}
