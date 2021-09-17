create user "uiserv"@"localhost" identified by "123456";

create database ui;

-- grant all privileges on *.* to '用户名'@'指定ip' identified by '用户密码' ;
grant all privileges  on ui.* to 'uiserv'@'localhost';


-- 组件库表 component
-- id, key, name, desc
create table if not exists `component` (
    id int auto_increment,
    name varchar(60) not null,
    key varchar(60) not null,
    version int,
    type int, -- 组件是单组件，还是复合组件
    primary key(`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 组件支持的属性表 property
-- id, key, name, componentId
create table if not exists `property` (
    id int auto_increment,
    key varchar(60) not null,
    name varchar(60),
    value varchar(100),
    subjectKey varchar(50), -- 这个属性需要用什么描述
    primary key(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
