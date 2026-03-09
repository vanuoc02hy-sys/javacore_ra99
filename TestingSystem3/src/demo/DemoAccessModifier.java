package demo;

import data.Student;

public class DemoAccessModifier {
    public static void main(String[] args) {
        Student student = new Student();
        student.id = 2;

        student.testMethod();
    }
}
