DROP DATABASE IF EXISTS human_friends;
CREATE DATABASE human_friends;
USE human_friends;

DROP TABLE IF EXISTS animals_class;
CREATE TABLE animals_class
	(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT UNIQUE,
	class VARCHAR(50)
	);

INSERT INTO animals_class(class) VALUES
	('Pets'),
	('PackAnimals');
	
CREATE TABLE pets
	(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT UNIQUE,
	class VARCHAR(50)
	);
	
INSERT INTO pets(class) VALUES
	('Cats'),
	('Dogs'),
	('Hamster');
	
CREATE TABLE pack_animals
	(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT UNIQUE,
	class VARCHAR(50)
	);
	
INSERT INTO pack_animals(class) VALUES
	('Horses'),
	('Camels'),
	('Donkeys');
	

DROP TABLE IF EXISTS animals;
CREATE TABLE animals 
	(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT UNIQUE,
	animal_name VARCHAR(50),
	birthday DATE,
	animal_class_id INT,
	animals_id INT,
	commands TEXT,
	FOREIGN KEY (animal_class_id) REFERENCES animals_class (id),
	FOREIGN KEY (animals_id) REFERENCES pack_animals (id)
	);


INSERT INTO animals 
	(
	animal_name,
	birthday,
	animal_class_id,
	animals_id,
	commands
	)
	VALUES
	('Муся', DATE("2018-01-01"), 1, 1,'Мурчать'),
	('Жучка', DATE("2019-02-02"), 1, 2,'Лежать'),
	('Вася', DATE("2020-03-03"), 1, 3,'Бежать'),
	('Иноходец', DATE("2021-04-04"), 2, 1,'Скакать'),
	('Скакун', DATE("2022-05-05"), 2, 2,'Везти'),
	('Осленок', DATE("2023-06-06"), 2, 3,'Тащить');
	
DELETE FROM animals
WHERE animals_id = 2 AND animal_class_id = 2;

DROP TABLE if EXISTS horses_and_donkeys;
CREATE TABLE horses_and_donkeys 
	SELECT * FROM animals
	WHERE animal_class_id = 2 AND animals_id != 2;

DROP TABLE if EXISTS young_animals;
CREATE TABLE young_animals
	SELECT * FROM animals
	WHERE birthday BETWEEN DATE_ADD(NOW(), INTERVAL -3 YEAR) AND DATE_ADD(NOW(), INTERVAL -1 YEAR);