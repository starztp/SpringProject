create database springproject;
use springproject;

create table project_user
(
  id int primary key  auto_increment,
  username varchar(200) not null unique,
  password varchar(200)
) engine=Innodb default charset=utf8;

insert into project_user(username,password) values ('admin','123');
insert into project_user(username,password) values ('tom','456');