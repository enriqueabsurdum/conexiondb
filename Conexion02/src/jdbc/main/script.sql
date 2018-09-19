-- MySQL
-- Host: 127.0.0.1
-- Port: 3306      
-- Database: jdbc_conexion_02

CREATE DATABASE jdbc_conexion_02;
USE jdbc_conexion_02;

DROP TABLE IF EXISTS usuarios;
CREATE TABLE usuarios (
    id_usuario SMALLINT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(45),
    email VARCHAR(45),
    clave VARCHAR(32),
    CONSTRAINT pk_usuarios PRIMARY KEY (id_usuario),
    CONSTRAINT uk_usuarios UNIQUE (email)
);

INSERT INTO usuarios VALUES (NULL, 'Pedro', 'pedre@email.com', md5('pedro'));
INSERT INTO usuarios VALUES (NULL, 'Raúl', 'raul@email.com', md5('raul'));
INSERT INTO usuarios VALUES (NULL, 'Macarena', 'macarena@email.com', md5('macarena'));
INSERT INTO usuarios VALUES (NULL, 'Ulises', 'ulises@email.com', md5('ulises'));
INSERT INTO usuarios VALUES (NULL, 'María', 'maria@email.com', md5('maria'));

SELECT id_usuario, nombre, email, clave FROM usuarios;

DROP TABLE IF EXISTS usuarios;
USE mysql;
DROP DATABASE jdbc_conexion_02;