package com.vti.frontend;

import com.vti.utils.ScannerUtils;

public class Program {
    public static void main(String[] args) {
        menu_login();
    }

    public static void menu_login() {
        System.out.println("-------------- Đăng Nhập -----------------");
        while (true) {
            System.out.println("Mời bạn nhập vào username: ");
            String username = ScannerUtils.inputString();
            System.out.println("Mời bạn nhập vào password: ");
            String password = ScannerUtils.inputString();

            if ("admin".equals(username) && "123456".equals(password)) {
                // Điều huơgns sang menu của admin
                menu_admin();
            } else if ("user".equals(username) && "123456".equals(password)) {
                // Điều hướng sang menu của user
                menu_user();
            } else {
                System.err.println("User hoặc mật khẩu ko chính xác. Mời nhập lại");
            }
            return;
        }
    }

    public static void menu_admin() {
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
                    System.out.println("Nhập username:");
                    String username = ScannerUtils.inputString();
                    System.out.println("Nhập email:");
                    String email = ScannerUtils.inputString();
                    System.out.println("Nhập departmentId:");
                    int departmentId = ScannerUtils.inputNumber();
                    // xử lý thêm mới user (password = 123456, role = USER)
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
                    break;
                case 2:
                    System.out.println("Nhập vào Id của User cần tìm:");
                    int userId = ScannerUtils.inputNumber();
                    // xử lý tìm kiếm user theo Id
                    break;
                case 3:
                    System.out.println("Nhập từ khoá (username hoặc email):");
                    String keyword = ScannerUtils.inputString();
                    // xử lý tìm kiếm theo username hoặc email
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
