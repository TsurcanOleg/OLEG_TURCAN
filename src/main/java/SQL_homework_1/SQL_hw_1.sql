create table Books (
book_id serial primary key,
name text,
author text,
date_of_publishing date,
genre text,
available_count int
);


select *
from books;

insert into books (name, author, date_of_publishing, genre, available_count)
values ('The GreatGatsby', 'F. Scot Fitzgerald', '1925-01-01', 'Clasics', 3),
('To kill a Mockingbird', 'Harper Lee', '1906-01-01', 'Ficnon', 5),
('1984', 'George Orwell', '1949-01-01', 'Science Ficnon', 2),
('Pride and Prejudice', 'Jane Austen', '1813-01-01', 'Romance', 4);