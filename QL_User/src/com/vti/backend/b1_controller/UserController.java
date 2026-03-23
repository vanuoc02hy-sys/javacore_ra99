package com.vti.backend.b1_controller;

import com.vti.backend.b2_service.IUserService;
import com.vti.backend.b2_service.UserService;
import com.vti.entity.User;

import java.util.List;

public class UserController {
    IUserService userService = new UserService();

    public List<User> viewAllUser(){
        // Gọi sang Service để thực hiện logic
        // Sau khi lấy dđược dữ liệu từ service
        // -> Trả về cho giao diện sử dụng và hiển thị
        return userService.viewAllUser();
    }

    public boolean addUser(User user){
        return userService.addUser(user);
    }
}
