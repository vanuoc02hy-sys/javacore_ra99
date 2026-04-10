package com.vti.utils;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ScannerUtils {
    static Scanner scanner = new Scanner(System.in);

    public static void main2(String[] args) {
        while (true) {
            System.out.println("----------- MENU -------------");
            System.out.println("1. Thêm mới account");
            System.out.println("2. Chỉnh sửa account");
            System.out.println("3. Xoá account");
            System.out.println("4. Danh sách account");
            System.out.println("5. Thoát");
            int number = ScannerUtils.inputNumber(1, 5);
            switch (number) {
                case 1:
                    System.out.println("Chức năng1");
                    break;
                case 2:
                    System.out.println("Chức năng 2");
                    break;
                case 3:
                    System.out.println("Chức năng 3");
                    break;
                case 4:
                    System.out.println("Chức năng 4");
                    break;
                case 5:
                    System.out.println("Đã thoát!!!");
                    return;
            }
        }
    }

    public static int inputNumber(int min, int max) {
        int number;
        do {
            number = inputNumber();
            if (number < min || number > max) {
                System.out.println("Số không hợp lệ, vui lòng nhập lại.");
            }
        } while (number < min || number > max);
        return number;
    }

    public static String inputString() {
        return scanner.nextLine();
    }

    public static Date inputDate() throws ParseException {
        int number1 = 100;
        long number2 = 1000;
        int number3 = (int) number2;


        System.out.println("Nhập vào giá trị ngày có định dạng: dd-MM-yyyy HH:mm:ss");
        SimpleDateFormat formatter2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String dateStr2 = ScannerUtils.inputString();
        return formatter2.parse(dateStr2);
    }

    public static int inputNumber() {
        return Integer.parseInt(scanner.nextLine()); // tránh TH bị trôi con trỏ
    }

    public static String inputEmail() {
        // chuỗi có chứa chữ @ sẽ là hợp lệ
        while (true) {
            String email = ScannerUtils.inputString();
//            if (email.contains("@") && email.contains(".")){
//                return email;
//            } else {
//                System.out.println("email ko hợp lệ, mời nhập lại");
//            }
            String regexEmail = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
            if (email.matches(regexEmail)) {
                return email;
            } else
                System.out.println("email ko hợp lệ, mời nhập lại");
        }
    }

    public static String inputEmailV2() {
        // chuỗi có chứa chữ @ sẽ là hợp lệ
        String email = ScannerUtils.inputString();
        String regexEmail = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        while (!email.matches(regexEmail)) {
            System.out.println("email ko hợp lệ, mời nhập lại");
            email = ScannerUtils.inputString();
        }
        return email;
    }

    //Password: nhập từ 6 tới 12 ký tự, || 2có ít nhất 1 ký tự viết hoa
    public static String inputPassword() {
        while (true) {
            String password = ScannerUtils.inputString();
            if (password.length() < 6 || password.length() > 12) {
                System.out.println("pw phải từ 6-12 ký tự, mời nhập lại!");
                continue;
            }
            // có ít nhất 1 ký tự viết hoa
            boolean hasUppercase = false;
            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    hasUppercase = true;
                    break;
                }
            }
            if (!hasUppercase) {
                System.out.println("pw phải có ít nhất 1 chữ viết hoa");
                continue;
            }
            return password;
        }
    }
}
