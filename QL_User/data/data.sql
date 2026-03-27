create database VTI;
drop database VTI;
use VTI;

CREATE TABLE Department (
                            DepartmentID INT PRIMARY KEY AUTO_INCREMENT,
                            departmentName VARCHAR(100) NOT NULL
);

INSERT INTO Department (departmentName) VALUES
('Human Resources'),
('Finance'),
('IT'),
('Marketing'),
('Sales'),
('Customer Support'),
('R&D');

CREATE TABLE User (
                      id INT PRIMARY KEY AUTO_INCREMENT,
                      role VARCHAR(50),
                      userName VARCHAR(50) NOT NULL,
                      fullName VARCHAR(100),
                      password VARCHAR(255),
                      email VARCHAR(100),
                      dob DATE,
                      CreateDate DATETIME,

                      DepartmentID INT,
                      FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID)
);

INSERT INTO User (role, userName, fullName, password, email, dob, DepartmentID) VALUES
('ADMIN', 'admin01', 'Nguyen Van A', '123456', 'a@gmail.com', '1990-01-01', 1),
('USER', 'user01', 'Tran Thi B', '123456', 'b@gmail.com', '1995-02-10', 2),
('USER', 'user02', 'Le Van C', '123456', 'c@gmail.com', '1998-03-15', 3),
('MANAGER', 'manager01', 'Pham Thi D', '123456', 'd@gmail.com', '1988-07-20', 4),
('USER', 'user03', 'Hoang Van E', '123456', 'e@gmail.com', '2000-12-05', 5),
('ADMIN', 'admin02', 'Vo Thi F', '123456', 'f@gmail.com', '1992-09-09', 6),
('USER', 'user04', 'Dang Van G', '123456', 'g@gmail.com', '1997-11-11', 7);