package com.vti.frontend;

import com.vti.backend.b1_controller.UserController;
import com.vti.entity.User;

import java.util.List;

public class Function {
    UserController userController = new UserController();

    public void viewAllUser(){
        // "Gọi vào back end để lấy danh sách user và hiển thị (in) ra ngoài màn hình");
        List<User> userList = userController.viewAllUser();
        // Hiển thị kết quả ra ngoài màn hình
        for (User user: userList) {
            System.out.println(user);
        }
    }
}
