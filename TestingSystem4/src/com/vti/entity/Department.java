package com.vti.entity;

public class Department {
    private int departmentID;
    private String departmentName;

    private Account[] allAccount;

    public Department() {
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Account[] getAllAccount() {
        return allAccount;
    }

    public void setAllAccount(Account[] allAccount) {
        this.allAccount = allAccount;
    }

    //    Có 1 parameter là nameDepartment và default id của com.vti.entity.Department = 0
    public Department(String departmentName){
        this.departmentName = departmentName;
        this.departmentID = 0;
    }
}
