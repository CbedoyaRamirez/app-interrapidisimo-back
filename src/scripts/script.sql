CREATE DATABASE `app-inter` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

CREATE TABLE `estudiantes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  `cedula` varchar(255) DEFAULT NULL,
  `materia_id` int NOT NULL,
  `profesor_id` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `materias` (
  `id` int NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `creditos` int DEFAULT NULL,
  `id_materia1` int NOT NULL,
  `id_materia2` int NOT NULL,
  `nombres` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `profesores` (
  `Id` int NOT NULL,
  `nombres` varchar(255) DEFAULT NULL,
  `id_Materia1` int NOT NULL,
  `id_Materia2` int NOT NULL,
  PRIMARY KEY (`Id`,`id_Materia1`,`id_Materia2`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



insert into `app-inter`.materias values (1,'Biologia', 3)
insert into  `app-inter`.materias values (2,'Calculo', 1)
insert into `app-inter`.materias values (3,'Quimica', 1)
insert into `app-inter`.materias values (4,'Educación Fisica', 1)
insert into `app-inter`.materias values (5,'Sistemas', 1)
insert into `app-inter`.materias values (6,'Mecanografia', 1)
insert into `app-inter`.materias values (7,'Musica', 1)
insert into `app-inter`.materias values (8,'Fisica', 1)
insert into `app-inter`.materias values (9,'Dibujo', 1)
insert into `app-inter`.materias values (10,'Religion', 1)


insert into `app-inter`.profesores values (1,'Carlos',1,2)
insert into `app-inter`.profesores values (2,'Pedro',5,6)
insert into `app-inter`.profesores values (3,'Raul',9,10)
insert into `app-inter`.profesores values (4,'Paola',3,4)
insert into `app-inter`.profesores values (5,'Luisa',7,8)