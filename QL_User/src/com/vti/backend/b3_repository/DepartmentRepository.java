package com.vti.backend.b3_repository;

import com.vti.entity.Department;
import com.vti.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DepartmentRepository {
    public List<Department> getAllDepartment() throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        String sql = "select * from Department";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        List<Department> list = new ArrayList<>();
        while (resultSet.next()){
            Department department = new Department();
            department.setId(resultSet.getInt("DepartmentId"));
            department.setDepartmentName(resultSet.getString("DepartmentName"));
            list.add(department);
        }
        return list;
    }
}
