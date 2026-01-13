CREATE DATABASE order_billing_db;
USE order_billing_db;

CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    customer_name VARCHAR(50),
    order_amount FLOAT,
    tax_percentage FLOAT,
    order_date DATE
);

INSERT INTO orders VALUES
(1, 'Amit', 2000, 5, CURDATE()),
(2, 'Neha', 3500, 12, CURDATE()),
(3, 'Ravi', 5000, 18, CURDATE());

SELECT * FROM orders;
