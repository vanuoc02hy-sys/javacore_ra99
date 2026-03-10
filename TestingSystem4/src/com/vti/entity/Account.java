package com.vti.entity;

import java.time.LocalDateTime;

public class Account {
    private int accountID;
    private String email;
    private String userName;
    private String fullName;
    private Department department;
    private Position position;
    private LocalDateTime createDate;
    private Group[] groups;

    // Hàm khởi tạo

    public Account() {
    }

    public Account(String userName) {
        this.userName = userName;
    }

    //    Có các parameter là id, Email, Username, FirstName, LastName (với FullName = FirstName + LastName)
    public Account(int id, String email, String userName,
                   String firstName, String lastName) {
        this.accountID = id;
        this.email = email;
        this.userName = userName;
        this.fullName = firstName + " " + lastName;
    }

    //    Có các parameter là id, Email, Username, FirstName, LastName (với FullName = FirstName + LastName) và
//    com.vti.entity.Position của User, default createDate = now
    public Account(int id, String email, String userName, String firstName,
                   String lastName, Position position) {
        this.accountID = id;
        this.email = email;
        this.userName = userName;
        this.fullName = firstName + " " + lastName;
        this.position = position;
        this.createDate = LocalDateTime.now();
    }

    //    Có các parameter là id, Email, Username, FirstName, LastName (với FullName = FirstName + LastName)
//    và com.vti.entity.Position của User, createDate
    public Account(int id, String email, String userName, String firstName, String lastName, Position position,
                   LocalDateTime createDate) {
        this.accountID = id;
        this.email = email;
        this.userName = userName;
        this.fullName = firstName + " " + lastName;
        this.position = position;
        this.createDate = createDate;
    }
    // Method
    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        String departmentName = department != null ? department.getDepartmentName() : "";
        return "Email: " + email + "\n" +
                "FullName: " + fullName + "\n" +
                "Phòng ban: " + departmentName;
    }
}
