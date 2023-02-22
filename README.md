# WebPG1
Practica grupal 1 Web


1. 
```
drop schema practica;
drop user 'usuario_practica';estado
create schema practica;

create user 'usuario_practica'@'%' identified by 'la_Clave';

create table practica.estado(
	id_estado INT NOT NULL auto_increment,
    nombre_estado VARCHAR(50) NOT NULL,
    num_provincias INT NOT NULL,
    costas BOOLEAN NOT NULL,
    poblacion INT NOT NULL,
    PRIMARY KEY(`id_estado`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_eo_0900_ai_ci;

INSERT INTO practica.estado (id_estado, nombre_estado, num_provincias, costas, poblacion) VALUES 
(1, 'Costa Rica', 7, TRUE, 5000000);
```
