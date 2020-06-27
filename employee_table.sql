create database employee_system;
use employee_system;

create table employees(
emp_id bigint(20) not null auto_increment,
first_name varchar(40) NOT NULL,
second_name varchar(40),
address varchar(255),
mobile_no int,
email varchar(100),
primary key (emp_id)
);

select * from employees;
insert into employees (first_name, second_name, address, mobile_no, email) 
values("testFrist", "testSecond", "test address", 0711234569, "test@gmail.com");