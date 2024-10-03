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

 INSERT INTO plants (id, name, size_cm, environment, color, origin) VALUES
   (1, 'Rosa Roja', 50, 'Terrestre', 'Rojo', 'Asia'),
   (2, 'Tulipanes', 40, 'Terrestre', 'Blanco', 'Holanda'),
   (3, 'Loto Sacrado', 20, 'Acuatica', 'Blanco', 'Asia'),
   (5, 'Aldrovanda', 30, 'acuatica', 'Verde', 'Australia'),
   (6, 'Posidonia oceánica', 150, 'acuática', 'Verde claro intenso', 'Endémica del Mediterraneo'),
   (7, 'Cactus', 5, 'Terrestre', 'Verde', 'México'),
   (8, 'Orquídea', 15, 'Terrestre', 'Morado', 'China'),
   (9, 'Helecho', 20, 'Acuática', 'Verde', 'América del Norte'),
   (10, 'Lirio', 12, 'Terrestre', 'Blanco', 'Europa'),
   (11, 'Violeta', 8, 'Terrestre', 'Azul', 'África');

