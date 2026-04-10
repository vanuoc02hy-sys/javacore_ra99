package com.vti.frontend;

import com.vti.utils.ScannerUtils;

import java.sql.SQLException;

public class Program {
    static Function function = new Function();

    public static void main(String[] args) throws SQLException {
        menu();
    }


    public static void menu() throws SQLException {
        while (true) {
            System.out.println("----------- ADMIN -------------");
            System.out.println("1. Lấy ra tất cả nhân viên theo phòng ban");
            System.out.println("2. Lấy ra tất cả quản lý");
            System.out.println("3. Đăng nhập hệ thống (Demo)");
            System.out.println("4. Thoát");

            int number = ScannerUtils.inputNumber(1, 9);
            switch (number) {
                case 1:
                    function.viewAllEmployeeByProjectId();
                    break;
                case 2:
                    function.viewAllManager();
                    break;
                case 3:
                    function.login();
                    break;
                case 4:
                    System.out.println("Đã thoát chương trình!");
                    return;
            }
        }
    }

}
