create table departments (
department_id int primary key,
department_name VARCHAR(50)
);

create table employee (
employee_id int primary key,
employee_name VARCHAR(50),
department_id int,
foreign key (department_id) references departments(department_id)
);

create table projects(
project_id int primary key,
project_name VARCHAR(50)
);

create table employee_projects (
employee_id int,
project_id int,
foreign key (employee_id) references employee(employee_id),
foreign key (project_id) references projects(project_id)
);

select *
from departments;
select *
from employee;
select *
from projects;
select *
from employee_projects;

insert into departments(department_id, department_name)
values (1, 'development'),
(2, 'testing'),
(3, 'quality control');

insert into employee (employee_id, employee_name, department_id)
values (1, 'Victor', 1),
(2, 'Ivan', 1),
(3, 'Semion', 2),
(4, 'Cristina', 2),
(5, 'Valentina', 3);

insert into employee (employee_id, employee_name, department_id)
values (6, 'Violetta', null);

insert into projects (project_id, project_name)
values (1, 'Quantum Bridge'),
(2, 'Software Project'),
(3, 'Cloud Sphere');

insert into employee_projects (employee_id, project_id)
values (1, 1),
(1, 2),
(2, 1),
(3, 2),
(4, 3),
(5, 2);


select employee.employee_name, departments.department_name
from employee
inner join departments on employee.department_id = departments.department_id;

select employee.employee_name
from employee
where department_id is null;

select p.project_name, e.employee_name
from projects p
inner join employee_projects ep on p.project_id = ep.project_id
inner join employee e on ep.employee_id = e.employee_id;

select e.employee_name, departments.department_name
from employee e
inner join departments on e.department_id = departments.department_id;

select d.department_name, count(e.employee_id) as employee_count
from departments d
inner join employee e on d.department_id = e.department_id
group by d.department_name;
