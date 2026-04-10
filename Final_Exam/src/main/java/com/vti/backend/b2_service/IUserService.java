package com.vti.backend.b2_service;

import com.vti.entity.User;

import java.util.List;

public interface IUserService { // liệt kê các chức năng

    List<User> findAllEmployeeByProjectId(int projectId);

    List<User> findAllManager();

    User login(String password, String username);
}
