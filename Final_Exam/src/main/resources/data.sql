CREATE TABLE users (
                       id INT PRIMARY KEY AUTO_INCREMENT,
                       full_name VARCHAR(255),
                       email VARCHAR(255),
                       password VARCHAR(255),
                       exp_in_year INT,
                       pro_skill VARCHAR(255),
                       project_id INT,
                       role ENUM('MANAGER', 'EMPLOYEE')
);


INSERT INTO users (full_name, email, password, exp_in_year, pro_skill, project_id, role) VALUES
-- Managers (pro_skill = NULL)
('Nguyen Van A', 'a@gmail.com', '123456', 10, NULL, 1, 'MANAGER'),
('Tran Thi B', 'b@gmail.com', '123456', 8, NULL, 2, 'MANAGER'),
('Le Van C', 'c@gmail.com', '123456', 12, NULL, 3, 'MANAGER'),
('Pham Thi D', 'd@gmail.com', '123456', 15, NULL, 1, 'MANAGER'),
('Hoang Van E', 'e@gmail.com', '123456', 7, NULL, 2, 'MANAGER'),

-- Employees (exp_in_year = NULL)
('Nguyen Van F', 'f@gmail.com', '123456', NULL, 'Java', 1, 'EMPLOYEE'),
('Tran Thi G', 'g@gmail.com', '123456', NULL, 'Python', 2, 'EMPLOYEE'),
('Le Van H', 'h@gmail.com', '123456', NULL, 'C++', 3, 'EMPLOYEE'),
('Pham Thi I', 'i@gmail.com', '123456', NULL, 'ReactJS', 1, 'EMPLOYEE'),
('Hoang Van K', 'k@gmail.com', '123456', NULL, 'NodeJS', 2, 'EMPLOYEE');