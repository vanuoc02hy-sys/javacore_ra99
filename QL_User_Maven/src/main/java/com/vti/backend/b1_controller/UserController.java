package com.vti.backend.b1_controller;

import com.vti.backend.b2_service.IUserService;
import com.vti.backend.b2_service.UserService;
import com.vti.entity.ResponseBase;
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

    public  User findUserById(int id){
        return userService.findUserById(id);
    }

    public ResponseBase<User> findUserByIdV2(int id){
        User user = userService.findUserById(id);
        ResponseBase<User> response = new ResponseBase<>();
        response.setData(user);
        response.setSuccess(true);
        response.setMessage("Thành công");
        return response;
    }

    public boolean addUser(User user){
        return userService.addUser(user);
    }

    public List<User> search(String keyword){
        return userService.search(keyword);
    }

    public User login(String password, String username) {
        return userService.login(password, username);
    }
}
