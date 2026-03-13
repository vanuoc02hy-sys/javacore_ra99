package com.vti.demo;

public class Quiz {
    public static void main(String[] args) {
        Animal2 myPet = new Dog2();
        myPet.eat();
    }
}

class Animal2{
    void eat(){
        System.out.println("2222");
    }
}

class Dog2 extends Animal2{
    void eat(){
        System.out.println("2222");
    }

    void bark(){
        System.out.println(3333);
    }

    public Dog2() {

        // gọi tới hàm khởi tạo ko tham số
        // từ khoả để gọi tới hàm khởi tạo của đối tượng cha là super();

    }
}