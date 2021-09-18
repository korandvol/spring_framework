DROP DATABASE  IF EXISTS jpa;

CREATE DATABASE jpa CHAR SET UTF8;
USE jpa;

CREATE TABLE users(
userid INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
email VARCHAR(120) NOT NULL,
enabled INT(11),
password VARCHAR(120) NOT NULL,
username VARCHAR(64) NOT NULL
);

CREATE TABLE user_roles(
user_role_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
role VARCHAR(120) NOT NULL,
user_id INT(11)
);

INSERT INTO users (email, username, enabled, password) VALUES(
'kav@gmail.com','Andrii Korchak', '1','1234567890');
SELECT * FROM  users;