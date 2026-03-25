package com.vti.frontend;

import com.vti.backend.b1_controller.UserController;
import com.vti.entity.User;
import com.vti.utils.ScannerUtils;

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

    public void findUserById(){
        System.out.println("Mời bạn nhập vào user id muốn tìm kiếm");
        int id = ScannerUtils.inputNumber();
        User user = userController.findUserById(id);
        if (user != null){
            System.out.println(user);
        } else {
            System.out.println("Không có kết quả trả về");
        }
    }

    public void search(){
        System.out.println("Mời bạn nhập vào từ khoá tìm kiếm");
        String keyword = ScannerUtils.inputString();
        List<User> userList = userController.search(keyword);
        if (userList == null || userList.isEmpty()){
            System.out.println("Không có kết quả phù hợp");
            return;
        }
        for (User user: userList) {
            System.out.println(user);
        }
    }

    public static void main(String[] args) {
        new Function().createUser();
    }

    public void createUser(){
        System.out.println("Mời bạn nhập vào username");
        String username = ScannerUtils.inputString();
        System.out.println("Mời bạn nhập vào fullName");
        String fullName = ScannerUtils.inputString();
        System.out.println("Mời bạn nhập vào email");
        String email = ScannerUtils.inputString(); // chỉnh lại hàm cho hợp lý
        System.out.println("Mời bạn nhập vào departmentId");
        int departmentId = ScannerUtils.inputNumber();
        System.out.println("Mời bạn nhập vào password");
        String password = ScannerUtils.inputString();

        User user = new User();
        user.setUserName(username);
        user.setEmail(email);
        user.setDepartmentId(departmentId);
        user.setPassword(password);
        user.setFullName(fullName);

        boolean isCreate = userController.addUser(user);
        System.out.println(isCreate ? "Tạo mới User thành công" : "Tạo User thất bại");
    }
}
