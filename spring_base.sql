SET NAMES 'UTF8MB4';
DROP DATABASE IF EXISTS spring;
CREATE DATABASE IF NOT EXISTS spring DEFAULT CHARACTER SET UTF8MB4;
USE spring;

CREATE TABLE cliente(
id_clt						INTEGER NOT NULL AUTO_INCREMENT,
nombre						VARCHAR(30) NOT NULL,
apellido					VARCHAR(30) NOT NULL,
correo						VARCHAR(70) NOT NULL UNIQUE,
telefono					VARCHAR(10) NOT NULL UNIQUE,
PRIMARY KEY(id_clt)
)DEFAULT CHARACTER SET UTF8MB4;