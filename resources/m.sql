create user "uiserv"@"localhost" identified by "123456";

create database ui;

-- grant all privileges on *.* to '用户名'@'指定ip' identified by '用户密码' ;
grant all privileges  on ui.* to 'uiserv'@'localhost';


