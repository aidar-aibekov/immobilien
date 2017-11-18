CREATE TABLE `Haus` (
	`id_haus` INT NOT NULL AUTO_INCREMENT,
	`address` varchar(255) NOT NULL,
	`schaetzung` INT(1) NOT NULL,
	`preis` INT(11) NOT NULL,
	`besitzer_id` INT(1) NOT NULL,
	PRIMARY KEY (`id_haus`)
);

CREATE TABLE `Besitzer` (
	`id_besitzer` INT NOT NULL AUTO_INCREMENT,
	`name` varchar(255) NOT NULL,
	`telefonnummer` varchar(255) NOT NULL,
	PRIMARY KEY (`id_besitzer`)
);

CREATE TABLE `Kaufinteressanten` (
	`id_kaufinteressanten` INT NOT NULL AUTO_INCREMENT,
	`name` varchar(255) NOT NULL,
	PRIMARY KEY (`id_kaufinteressanten`)
);

CREATE TABLE `Verkauf` (
	`id_verkauf` INT NOT NULL AUTO_INCREMENT,
	`haus_id` INT(11) NOT NULL,
	PRIMARY KEY (`id_verkauf`)
);

CREATE TABLE `Haus_kaufint` (
	`haus_id` INT NOT NULL,
	`kauf_id` INT NOT NULL
);

ALTER TABLE `Haus` ADD CONSTRAINT `Haus_fk0` FOREIGN KEY (`besitzer_id`) REFERENCES `Besitzer`(`id_besitzer`);

ALTER TABLE `Verkauf` ADD CONSTRAINT `Verkauf_fk0` FOREIGN KEY (`haus_id`) REFERENCES `Haus`(`id_haus`);

ALTER TABLE `Haus_kaufint` ADD CONSTRAINT `Haus_kaufint_fk0` FOREIGN KEY (`haus_id`) REFERENCES `Haus`(`id_haus`);

ALTER TABLE `Haus_kaufint` ADD CONSTRAINT `Haus_kaufint_fk1` FOREIGN KEY (`kauf_id`) REFERENCES `Kaufinteressanten`(`id_kaufinteressanten`);

