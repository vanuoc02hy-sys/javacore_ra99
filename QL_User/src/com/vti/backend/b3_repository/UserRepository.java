package com.vti.backend.b3_repository;

import com.vti.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public List<User> viewAllUser(){
        // Kết nối tới database để thực hiện tính năng
        String sql = "select * from user";
        List<User> userList = new ArrayList<>();
        return userList;
    }


}
