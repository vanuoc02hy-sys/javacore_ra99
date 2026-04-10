package com.vti.utils;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JdbcUtils {
    static Connection connection;

    public static Connection getConnection() {
        try {
            Properties propertiesFile = new Properties();
            propertiesFile.load(new FileInputStream("Final_Exam/src/main/resources/config.properties"));

            String username = propertiesFile.getProperty("user");
            String password = propertiesFile.getProperty("password");
            String url = propertiesFile.getProperty("url");
            String driver = propertiesFile.getProperty("driver");
            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, password);
            return connection;
        } catch (Exception ex) {
            System.out.println("Có lỗi xảy ra....");
        }
        return null;
    }

    // đóng kết nối
    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
