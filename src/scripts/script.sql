CREATE TABLE `app-inter`.`estudiantes` (
  `id` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `materia_id` INT NOT NULL,
  `profesor_id` INT NOT NULL,
  PRIMARY KEY (`id`));


CREATE TABLE `app-inter`.`materias` (
  `id` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `creditos` INT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `app-inter`.`profesores` (
  `Id` INT NOT NULL,
  `Nombres` VARCHAR(45) NOT NULL,
  `id_Materia1` INT NOT NULL,
  `id_Materia2` INT NOT NULL,
  PRIMARY KEY (`Id`));

CREATE TABLE `app-inter`.`programas` (
  `Id` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `creditos` INT NOT NULL,
  PRIMARY KEY (`Id`));


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


insert into `app-inter`.profesores values (1,'Carlos',1,3)
insert into `app-inter`.profesores values (2,'Pedro',4,6)
insert into `app-inter`.profesores values (3,'Raul',5,3)
insert into `app-inter`.profesores values (4,'Paola',6,1)
insert into `app-inter`.profesores values (5,'Luisa',2,4)