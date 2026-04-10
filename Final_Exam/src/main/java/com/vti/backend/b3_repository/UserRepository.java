package com.vti.backend.b3_repository;

import com.vti.entity.Role;
import com.vti.entity.User;
import com.vti.utils.JdbcUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public List<User> findAllEmployeeByProjectId(int projectId) throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        String sql = "SELECT * FROM User a where a.project_id = ? and a.role = 'EMPLOYEE'";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, projectId);
        ResultSet result = preparedStatement.executeQuery();
        List<User> userList = new ArrayList<>();
        if (result.next()) {
            User user = new User();
            int id = result.getInt("id");
            String fullName = result.getString("full_name");
            String email = result.getString("email");
            String roleStr = result.getString("role");
            Role role = Role.valueOf(roleStr); // Convert String -> Role
            // Không lấy thông tin password để hiển thị vì thông tin nhạy cảm
            user.setFullName(fullName);
            user.setEmail(email);
            user.setId(id);
            user.setRole(role);

            userList.add(user);
        }
        JdbcUtils.closeConnection();
        return userList;
    }

    public List<User> findAllManager() throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        String sql = "SELECT * FROM User a where a.role = 'MANAGER'";
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(sql);
        List<User> userList = new ArrayList<>();
        while (result.next()) {
            User user = new User();
            int id = result.getInt("id");
            String fullName = result.getString("full_name");
            String email = result.getString("email");
            String roleStr = result.getString("role");
            Role role = Role.valueOf(roleStr); // Convert String -> Role

            user.setFullName(fullName);
            user.setEmail(email);
            user.setId(id);
            user.setRole(role);

            userList.add(user);
        }
        return userList;
    }

    public User login(String password, String email) throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        String sql = "select * from User where password = ? and email =? ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, password);
        preparedStatement.setString(2, email);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            // Tạo đối tượng user để reutrn
            User user = new User();
            user.setEmail(resultSet.getString("email"));
            user.setFullName(resultSet.getString("full_name"));
            // Các thông tin khác
            String roleStr = resultSet.getString("role"); // USER
            Role role = Role.valueOf(roleStr);
            user.setRole(role);
            return user;
        } else {
            return null;
        }
    }
}
