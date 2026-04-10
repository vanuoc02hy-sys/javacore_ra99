package com.vti.backend.b2_service;

import com.vti.backend.b3_repository.UserRepository;
import com.vti.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements IUserService {
    UserRepository userRepository = new UserRepository();

    @Override
    public List<User> findAllEmployeeByProjectId(int projectId) {
        try {
            return userRepository.findAllEmployeeByProjectId(projectId);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Có lỗi xảy ra");
            return new ArrayList<>();
        }
    }

    @Override
    public List<User> findAllManager() {
        try {
            return userRepository.findAllManager();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Có lỗi xảy ra");
            return new ArrayList<>();
        }
    }


    public User login(String password, String username) {
        try {
            return userRepository.login(password, username);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }

    }

}
