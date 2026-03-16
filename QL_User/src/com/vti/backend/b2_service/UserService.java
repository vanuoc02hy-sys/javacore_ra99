package com.vti.backend.b2_service;

import com.vti.backend.b3_repository.UserRepository;
import com.vti.entity.User;

import java.util.List;

public class UserService implements IUserService{
    UserRepository userRepository = new UserRepository();

    @Override
    public List<User> viewAllUser() {
        // Thực hiện logic
        // Gọi vào repository để lấy dữ liệu từ database
        return userRepository.viewAllUser();
    }
}
