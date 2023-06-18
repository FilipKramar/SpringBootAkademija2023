create table test(

id int primary key auto_increment,
name varchar(100),
description varchar(255)
);


INSERT INTO test (name, description)
VALUES ('John Doe', 'Example description');