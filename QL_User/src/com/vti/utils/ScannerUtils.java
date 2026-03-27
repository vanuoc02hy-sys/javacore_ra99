package com.vti.utils;

import com.vti.backend.b3_repository.DepartmentRepository;
import com.vti.entity.Department;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ScannerUtils {
    static Scanner scanner = new Scanner(System.in);

    public static void main2(String[] args) {
        while (true){
            System.out.println("----------- MENU -------------");
            System.out.println("1. Thêm mới account");
            System.out.println("2. Chỉnh sửa account");
            System.out.println("3. Xoá account");
            System.out.println("4. Danh sách account");
            System.out.println("5. Thoát");
            int number = ScannerUtils.inputNumber(1,5);
            switch (number){
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

    public static String inputEmail(){
        String email = scanner.nextLine();

        return email;
    }

    public static String inputString(){
        return scanner.nextLine();
    }

    public static Date inputDate() throws ParseException {
        System.out.println("Nhập vào giá trị ngày có định dạng: dd-MM-yyyy HH:mm:ss");
        SimpleDateFormat formatter2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String dateStr2 = ScannerUtils.inputString();
        return formatter2.parse(dateStr2);
    }

    public static int inputNumber(){
        return Integer.parseInt(scanner.nextLine()); // tránh TH bị trôi con trỏ
    }

    public static void main(String[] args) throws SQLException {
        ScannerUtils.inputDepartmentId();
    }
    public static int inputDepartmentId() throws SQLException {
        DepartmentRepository departmentRepository = new DepartmentRepository();
        System.out.println("Mời bạn chọn id Department tương ứng");
        List<Department> list = departmentRepository.getAllDepartment();
        for (Department department : list) {
            System.out.println(department.getId() + ". " + department.getDepartmentName());
        }
        int departmentId = ScannerUtils.inputNumber();
        while (true){
            boolean check = false;
            for (Department department :list ) {
                if (department.getId() == departmentId){
                    check = true;
                }
            }
            // sau vòng lặp for, kiểm tra giá trị id có trong ds hay ko
            if (check){
                break;
            } else {
                System.err.println("ID bạn nhập không tồn tại trong danh sách");
                departmentId = ScannerUtils.inputNumber();
            }
        }
        return departmentId;
    }
}
