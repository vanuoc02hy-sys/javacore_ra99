package com.vti.backend.b2_service;

import com.vti.backend.b3_repository.UserRepository;
import com.vti.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements IUserService {
    UserRepository userRepository = new UserRepository();

    @Override
    public List<User> viewAllUser() {
        // Thực hiện logic
        // Gọi vào repository để lấy dữ liệu từ database
        try {
            return userRepository.viewAllUser();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Lấy ra danh sách bị lỗi");
            return new ArrayList<>();// Khi có lỗi, return danh sách trống
        }
    }

    @Override
    public User findUserById(int id) {
        // Thực hiện logic
        // Gọi vào repository để lấy dữ liệu từ database
        try {
            return userRepository.findUserById(id);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Lấy user bị lỗi");
            return null;// Khi có lỗi, return danh sách trống
        }
    }

    @Override
    public boolean addUser(User user) {
        return userRepository.addUser(user);
    }

    @Override
    public List<User> search(String keyword) {
        try {
            return userRepository.findByUsernameOrEmail(keyword);
        } catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Có lỗi xảy ra");
            return new ArrayList<>();
        }
    }

    public boolean addUser() {
        // Thực hiện logic
        // truy vấn vào trong database để kiểm tra username có tồn tại hay ko

        // chạy câu lệnh insert into
        return true;
    }

}
