/* 1. mysql -u root �Cp */
/* 2. mysql> source D:\java\Note\JAVA\fundamental\src\org\java\core\base\jdbc\example\schema_mysql.sql */
/* ��--ע�ͱ��� */

drop database if exists UserDB;

create database if not exists UserDB CHARACTER SET utf8mb4;

use UserDB;

/*mysql create Users*/
create table Users(
id int(3) primary key,
name varchar(20),
email varchar(20),
country varchar(20),
password varchar(20)
);

INSERT INTO Users (id, name, email, country, password)
VALUES (1, 'xzj', 'xzj@qq.com', 'China', 'xzj123');
INSERT INTO Users (id, name, email, country, password)
VALUES (4, 'David', 'David@gmail.com', 'USA', 'David123456');
INSERT INTO Users (id, name, email, country, password)
VALUES (5, 'Rose', 'Rose@Apple.com', 'UK', 'Rose123456');
commit;

/*��ע�⣬Oracle��MySQL���ݿ��е��������Ͳ�ͬ��
�����Ϊʲô���ṩ��������ͬ��SQL DDL��ѯ������Users���ԭ��*/