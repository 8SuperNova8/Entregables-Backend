CREATE DATABASE plantstore;

USE plantstore;

CREATE TABLE plants
 (id INT AUTO_INCREMENT NOT NULL,
 name VARCHAR(60),
 size_cm DOUBLE,
 environment VARCHAR (60),
 color VARCHAR (60),
 origin VARCHAR (60),
 PRIMARY KEY (id));

