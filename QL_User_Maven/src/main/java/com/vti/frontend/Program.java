package com.vti.frontend;

import com.vti.entity.Role;
import com.vti.entity.User;
import com.vti.utils.ScannerUtils;

import java.sql.SQLException;

public class Program {
    static Function function = new Function();

    public static void main(String[] args) throws SQLException {
        final int number = 1;
        System.out.println(number);
        menu_user();
    }

    public static void menu_login() throws SQLException {
        System.out.println("-------------- Đăng Nhập -----------------");
//        String abc = null;
//        System.out.println("abc".equals(abc));
        while (true) {
            User user = function.login();
            // đăng nhập được thành công rồi
            // Điều hướng menu theo role người dùng
            if (Role.ADMIN == user.getRole()){
                menu_admin();
            } else {
                menu_user();
            }
            return;
        }
    }

    public static void menu_admin() throws SQLException {
        while (true) {
            System.out.println("----------- ADMIN MENU -------------");
            System.out.println("1. Hiển thị danh sách tất cả User (kèm departmentName)");
            System.out.println("2. Xóa User theo Id");
            System.out.println("3. Thay đổi mật khẩu của User");
            System.out.println("4. Thêm mới User (password mặc định: 123456, role: USER)");
            System.out.println("5. Hiển thị danh sách tất cả Department");
            System.out.println("6. Xóa Department theo Id");
            System.out.println("7. Thay đổi tên Department");
            System.out.println("8. Thêm mới Department");
            System.out.println("9. Thoát");

            int number = ScannerUtils.inputNumber(1, 9);
            switch (number) {
                case 1:
                    // Hiển thị danh sách tất cả User và departmentName (dạng bảng)

                    break;
                case 2:
                    System.out.println("Nhập Id của User cần xóa:");
                    int userId = ScannerUtils.inputNumber();
                    // xử lý xóa user theo Id (kiểm tra tồn tại)
                    break;
                case 3:
                    System.out.println("Nhập Id của User cần đổi mật khẩu:");
                    int changePassId = ScannerUtils.inputNumber();
                    System.out.println("Nhập mật khẩu mới:");
                    String newPassword = ScannerUtils.inputString();
                    // xử lý đổi mật khẩu
                    break;
                case 4:
                    function.createUser();
                    break;
                case 5:
                    // Hiển thị danh sách tất cả Department (dạng bảng)
                    break;
                case 6:
                    System.out.println("Nhập Id của Department cần xóa:");
                    int deleteDepartmentId = ScannerUtils.inputNumber();
                    // xử lý xóa department theo Id (kiểm tra tồn tại)
                    break;
                case 7:
                    System.out.println("Nhập Id của Department cần đổi tên:");
                    int updateDepartmentId = ScannerUtils.inputNumber();
                    System.out.println("Nhập tên Department mới:");
                    String newDepartmentName = ScannerUtils.inputString();
                    // xử lý đổi tên department
                    break;
                case 8:
                    System.out.println("Nhập tên Department mới:");
                    String departmentName = ScannerUtils.inputString();

                    // xử lý thêm mới department
                    break;
                case 9:
                    System.out.println("Đã thoát chương trình!");
                    return;
            }
        }
    }

    public static void menu_user() {
        while (true) {
            System.out.println("----------- USER MENU -------------");
            System.out.println("1. Hiển thị danh sách tất cả User (kèm departmentName)");
            System.out.println("2. Tìm kiếm User theo Id");
            System.out.println("3. Tìm kiếm User theo Username hoặc Email");
            System.out.println("4. Hiển thị danh sách tất cả Department");
            System.out.println("5. Tìm kiếm Department theo Id");
            System.out.println("6. Tìm kiếm Department theo Department Name");
            System.out.println("7. Thoát");
            int number = ScannerUtils.inputNumber(1, 7);
            switch (number) {
                case 1:
                    // Hiển thị danh sách tất cả User và departmentName (dạng bảng)
                    function.viewAllUser();
                    break;
                case 2:
                    // xử lý tìm kiếm user theo Id
                    function.findUserById();
                    break;
                case 3:
                    function.search();
                    break;

                case 4:
                    // Hiển thị danh sách tất cả Department (dạng bảng)
                    break;

                case 5:
                    System.out.println("Nhập vào Id của Department cần tìm:");
                    int departmentId = ScannerUtils.inputNumber();
                    // xử lý tìm kiếm department theo Id
                    break;
                case 6:
                    System.out.println("Nhập vào tên Department cần tìm:");
                    String departmentName = ScannerUtils.inputString();
                    // xử lý tìm kiếm department theo name
                    break;
                case 7:
                    System.out.println("Đã thoát chương trình!");
                    return;
            }
        }
    }
}
