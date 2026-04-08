package com.vti.demo;

public class MultiThreadExample {

    public static void main(String[] args) {
        MyThread t1 = new MyThread("Luồng 1");
        MyThread t2 = new MyThread("Luồng 2");

        t1.start(); // Chạy luồng t1
        t2.start(); // Chạy luồng t2 song song
    }
}

class MyThread extends Thread {
    private String abc;

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(this.abc + " - " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public MyThread(String abc) {
        this.abc = abc;
    }

}
