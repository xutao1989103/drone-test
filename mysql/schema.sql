-- 创建数据库
drop database if exists cd_test;
create database `cd_test` default character set utf8 collate utf8_general_ci;

use cd_test;

DROP TABLE IF EXISTS `city`;

CREATE TABLE `city` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT ,
  `province_id` int(11) unsigned DEFAULT NULL ,
  `city_name` varchar(100) DEFAULT NULL ,
  `description` varchar(2000) DEFAULT NULL ,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into city values (1,1,'hangzhou', 'city of beauty');