CREATE DATABASE attendance_db;
USE attendance_db;

CREATE TABLE employee (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    department VARCHAR(30)
);

CREATE TABLE attendance (
    attendance_id INT PRIMARY KEY,
    emp_id INT,
    attendance_date DATE,
    is_present BOOLEAN,
    FOREIGN KEY (emp_id) REFERENCES employee(emp_id)
);

INSERT INTO employee VALUES
(1, 'Krunal', 'IT'),
(2, 'Vijay', 'HR');


INSERT INTO attendance VALUES
(101, 1, CURDATE(), TRUE),
(102, 2, CURDATE(), FALSE);

SELECT * FROM attendance;
