package com.vti.backend.b3_repository;

import com.vti.entity.User;
import com.vti.utils.JdbcUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public List<User> viewAllUser() throws SQLException {
        //B1: Kết nối tới databe
        Connection connection = JdbcUtils.getConnection();
        // B2: Xác định câu lệnh SQL
        String sql = "SELECT * FROM Account a " +
                "join department d on a.DepartmentID = d.DepartmentID";
        // B3: Xác định đối tượng Statement tương ứng với câu lệnh
        Statement statement = connection.createStatement();
        // B4: Thực thi câu lệnh và hứng kết quả trả về
        ResultSet result = statement.executeQuery(sql);
        List<User> data = new ArrayList<>();
        while (result.next()) {
            // B5.2 Lấy kết quả của từng hàng
            User user = new User();

            String email = result.getString("Email");
            String userNameSQL = result.getString("Username");
            int id = result.getInt("AccountID");
            String departmentName = result.getString("DepartmentName");

            // B5.3: set các giá trị vào thuộc tính của dối tượng tương ứng
            user.setEmail(email);
            user.setUserName(userNameSQL);
            user.setId(id);
            user.setDepartmentName(departmentName);

            data.add(user);
        }
        return data;
    }

    // thêm mới user
    public boolean addUser(User user) {
        //B1: Kết nối tới databe
        Connection connection = JdbcUtils.getConnection();
        return true;
    }

    public User findUserById(int id) throws SQLException {
        //B1: Kết nối tới databe
        Connection connection = JdbcUtils.getConnection();
        // B2: Xác định câu lệnh SQL
        String sql = "SELECT * FROM Account a " +
                "join department d on a.DepartmentID = d.DepartmentID where a.AccountId = ?";
        // B3: Xác định đối tượng Statement tương ứng với câu lệnh
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        // B4: Thực thi câu lệnh và hứng kết quả trả về
        ResultSet result = preparedStatement.executeQuery();
        // B5.2 Lấy kết quả của từng hàng
        if (result.next()){
            User user = new User();
            String email = result.getString("Email");
            String userName = result.getString("Username");
            String departmentName = result.getString("DepartmentName");
            // ....
            // B5.3: set các giá trị vào thuộc tính của dối tượng tương ứng
            user.setUserName(userName);
            user.setEmail(email);
            user.setId(id);
            user.setDepartmentName(departmentName);
            return user;
        } else {
            return null;
        }
    }
}
