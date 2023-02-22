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
2. 
```
server.port = 91

spring.datasource.url=jdbc:mysql://localhost:3306/practica?useTimezone=true&serverTimezone=UTC
spring.datasource.username=usuario_practica
spring.datasource.password=la_Clave
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
```
