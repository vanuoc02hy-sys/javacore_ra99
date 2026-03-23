package com.vti.backend.b2_service;

import com.vti.entity.User;

import java.util.List;

public interface IUserService { // liệt kê các chức năng
    List<User> viewAllUser();

    User findUserById(int id);

    boolean addUser(User user);

    List<User> search(String keyword);
}
