package com.vti.backend.b1_controller;

import com.vti.backend.b2_service.IUserService;
import com.vti.backend.b2_service.UserService;
import com.vti.entity.User;

import java.util.List;

public class UserController {
    IUserService userService = new UserService();

    public List<User> findAllEmployeeByProjectId(int projectId) {
        return userService.findAllEmployeeByProjectId(projectId);

    }

    public List<User> findAllManager() {
        return userService.findAllManager();
    }

    public User login(String password, String username) {
        return userService.login(password, username);
    }
}
