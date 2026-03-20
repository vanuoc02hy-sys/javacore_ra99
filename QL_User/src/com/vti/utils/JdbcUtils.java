package com.vti.utils;

import com.vti.entity.Department;
import com.vti.entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcUtils {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // B1: Tạo kết nối tới database
        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3307/TestingSystem4";
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, username, password);

        demoPrepareStatement(connection);

    }

    public static void demoPrepareStatement(Connection connection) throws SQLException {
        // Lấy ra 1 account / user theo 1 giá trị id cụ thể.
        // B2: Xác định câu lệnh SQL
        String sql = "SELECT * FROM Account a where a.AccountID = ?";
        // B3.1: Xác định đối tượng Statement tương ứng với câu lệnh
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        // B3.2: Set giá trị cho các tham số ?
        System.out.println("Nhập vào account id muốn lấy");
        int id = ScannerUtils.inputNumber();
        preparedStatement.setInt(1, id);
        // B4: Thực thi câu lệnh và hứng kết quả trả về
        ResultSet result = preparedStatement.executeQuery();
        if (result.next()){
            User user = new User();
            String email = result.getString("Email");
            String userNameSQL = result.getString("Username");
//            String departmentName = result.getString("DepartmentName");

            // B5.3: set các giá trị vào thuộc tính của dối tượng tương ứng
            user.setEmail(email);
            user.setUserName(userNameSQL);
            user.setId(id);
//            user.setDepartmentName(departmentName);

            System.out.println(user);
        } else {
            System.err.println("Không có thông tin account");
        }

    }

    public static void demoStatement(Connection connection) throws SQLException {
        // B2: Xác định câu lệnh SQL
        String sql = "SELECT * FROM Account a " +
                "join department d on a.DepartmentID = d.DepartmentID";
        // B3: Xác định đối tượng Statement tương ứng với câu lệnh
        Statement statement = connection.createStatement();
        // B4: Thực thi câu lệnh và hứng kết quả trả về
        ResultSet result = statement.executeQuery(sql);
        // B5: Từ kết quả --> convert thành dữ liệu java tương ứng
        // B5.1: Tạo đối tượng cần trả về cụ thể khi thực thi xong câu lệnh
        List<User> data = new ArrayList<>();
        while (result.next()){
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
        for (User user : data) {
            System.out.println(user);
        }
    }
}
