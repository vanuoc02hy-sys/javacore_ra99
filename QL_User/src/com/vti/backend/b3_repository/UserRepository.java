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
        connection.close();
        return data;
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
        User user = null;
        if (result.next()) {
            user = new User();
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
        }
        connection.close();
        return user;
    }

    public List<User> findByUsernameOrEmail(String keyword) throws SQLException {
        keyword = "%" + keyword + "%";
        Connection connection = JdbcUtils.getConnection();
        String sql = "SELECT * FROM Account a " +
                "join department d on a.DepartmentID = d.DepartmentID " +
                " where a.Username like ? or a.Email like ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, keyword);
        preparedStatement.setString(2, keyword);

        ResultSet result = preparedStatement.executeQuery();
        List<User> userList = new ArrayList<>();
        while (result.next()) {
            User user = new User();
            String email = result.getString("Email");
            String userName = result.getString("Username");
            int id = result.getInt("AccountID");
            String departmentName = result.getString("DepartmentName");

            // B5.3: set các giá trị vào thuộc tính của dối tượng tương ứng
            user.setEmail(email);
            user.setUserName(userName);
            user.setId(id);
            user.setDepartmentName(departmentName);

            userList.add(user);
        }
        return userList;
    }

    public boolean addUser(User user) throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        // KHi thêm mới user -> cần truyền vào những tham số nào
        String sql = "insert into Account (Email, Username, DepartmentID, passwords, CreateDate, FullName) " +
                " VALUES (? , ? , ?, ? , ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, user.getEmail());
        preparedStatement.setString(2, user.getUserName());
        preparedStatement.setInt(3, user.getDepartmentId());
        preparedStatement.setString(4, user.getPassword());
        preparedStatement.setDate(5, new Date(new java.util.Date().getTime())); // Lấy ra thời gian hiện tại java.sql.Date
        preparedStatement.setString(6, user.getFullName());

        int result = preparedStatement.executeUpdate();
        return result > 0;
    }
}
