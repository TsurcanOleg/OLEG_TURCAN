select *
from students;

insert into students (name, surname, age, sex)
values ('Alice', 'Smith', 20, 'Famale'),
('Bob', 'Jahson', 22, 'Male'),
('Charlie', 'Brown', 19, 'Male'),
('Diana', 'Lee', 21, 'Famale'),
('Emely', 'Davis', 23, 'Famale');

update students
set age = '24'
where studentid = 5;

delete from students
where studentid = 3;

select *
from students s
where sex = 'Famale';

select *
from students s
where name like 'C%';