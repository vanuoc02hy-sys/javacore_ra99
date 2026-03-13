package com.vti.entity;

public class Student {
    private int id;
    private String name;
    private String hometown;
    private float point;

    public Student(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
        this.point = 0;
    }

    public Student() {
    }

    public void setPoint(float point) {
        this.point = point;
    }

    //    Tạo 1 method cho phép cộng thêm điểm
    public void congDiem(float themDiem) {
        this.point += themDiem;
    }

//    Tạo 1 method để in ra thông tin của sinh viên bao gồm có tên, điểm học lực
//            ( nếu điểm <4.0 thì sẽ in ra là Yếu, nếu điểm > 4.0 và < 6.0 thì sẽ in ra là trung bình,
//              nếu điểm >= 6.0 và < 8.0 thì sẽ in ra là khá, nếu > 8.0 thì in ra là Giỏi)
//    Demo các chức năng trên bằng class ở front-end.

    public void printInfo() {
        if (this.point < 4) {
            System.out.println("Yếu");
        } else if (this.point > 4 && this.point < 6) {
            System.out.println("Trung bình");
        } else if (this.point > 6 && this.point < 8) {
            System.out.println("Khá");
        } else {
            System.out.println("Giỏi");
        }
    }
}
