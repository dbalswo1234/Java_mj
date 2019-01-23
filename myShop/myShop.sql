create database myShop;


create table product (
id varchar(30) primary key not null,
pTitle varchar(50) not null,
pContent varchar(200),
price int(10));

insert into product values ("1","lush","hot",8000);





