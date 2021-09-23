create user "uiserv"@"localhost" identified by "123456";

create database ui;

-- grant all privileges on *.* to '用户名'@'指定ip' identified by '用户密码' ;
grant all privileges  on ui.* to 'uiserv'@'localhost';


-- 组件表
create table if not exists `t_component` (
    `component_id` int auto_increment,
    `name` varchar(60) not null,
    `type` int,  -- 描述组件是复合组件，还是独立组件 1， 0.
    `version` int,
    `component_key` varchar(20) not null unique,
    `creator_id` bigint ,
    `creator_name` varchar(30),
    `create_time` datetime,
    `modify_time` datetime,
    primary key (`component_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- 属性表
create table if not exists `t_property` (
    `property_id` int auto_increment,
    `property_key` int not null,
    `name` varchar(100) not null,
    `version` int,
    `component_key` varchar(20), -- 引用对应的组件需要用什么来描述
    `creator_id` bigint ,
    `creator_name` varchar(30),
    `create_time` datetime,
    `modify_time` datetime,
    primary key (`property_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- drop table `t_component`;

-- truncate table `t_component`;

-- delete from `t_component` where 1 = 1;
