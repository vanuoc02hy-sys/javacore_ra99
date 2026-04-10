package com.vti.frontend;

import com.vti.backend.b1_controller.UserController;
import com.vti.entity.User;
import com.vti.utils.ScannerUtils;

import java.sql.SQLException;
import java.util.List;

public class Function {
    UserController userController = new UserController();

    public void viewAllEmployeeByProjectId() {
        System.out.println("Nhập vào project ID muốn tìm kiếm");
        int projectId = ScannerUtils.inputNumber();
        List<User> userList = userController.findAllEmployeeByProjectId(projectId);
        // Hiển thị kết quả ra ngoài màn hình
        System.out.format("+----+--------------------+--------------------+%n");
        System.out.format("+ STT+        email       +     Full Name      +%n");
        System.out.format("+----+--------------------+--------------------+%n");
        for (User user : userList) {
            System.out.format("+ %-2s +  %-16s  +  %-16s  +%n",
                    user.getId(), user.getEmail(), user.getFullName());
            System.out.format("+----+--------------------+--------------------+%n");
        }
    }

    public void viewAllManager() {
        System.out.println("Mời bạn nhập vào user id muốn tìm kiếm");
        int id = ScannerUtils.inputNumber();
        List<User> response = userController.findAllManager();
        System.out.format("+----+--------------------+--------------------+-----------+%n");
        System.out.format("+ STT+        email       +     Full Name      + projectId +%n");
        System.out.format("+----+--------------------+--------------------+-----------+%n");
        for (User user : response) {
            System.out.format("+ %-2s +  %-16s  +  %-16s  +    %-10s +%n",
                    user.getId(), user.getEmail(), user.getFullName(), user.getProjectId());
            System.out.format("+----+--------------------+--------------------+-----------+%n");
        }
    }

    public void login() {
        System.out.println("Mời bạn nhập vào email: ");
        String email = ScannerUtils.inputEmailV2(); // có thể chỉnh sửa hàm
        System.out.println("Mời bạn nhập vào password");
        String password = ScannerUtils.inputPassword();
        User user = userController.login(password, email);
        while (user == null) {
            // yêu cầu ng dùng nhập lại
            System.err.println("Tài khoản hoặc mk không chính xác");
            System.out.println("Mời bạn nhập vào email: ");
            email = ScannerUtils.inputString(); // có thể chỉnh sửa hàm
            System.out.println("Mời bạn nhập vào password");
            password = ScannerUtils.inputString();
            user = userController.login(password, email);
        }
        System.out.println("--------- CHÀO MỪNG " + user.getFullName() + " -------------");
    }
}
