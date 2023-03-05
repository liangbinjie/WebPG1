# WebPG1
Practica grupal 1 Web


1. MySQL Database table creation
```
create schema practica;

create user 'usuario_practica'@'%' identified by 'la_Clave';
grant all privileges on practica.* to 'usuario_practica'@'%';
flush privileges;

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
2. Application Properties
```
server.port = 91

spring.datasource.url=jdbc:mysql://localhost:3306/practica?useTimezone=true&serverTimezone=UTC
spring.datasource.username=usuario_practica
spring.datasource.password=la_Clave
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
```

3. Thymeleaf
```
th:fragment="fragment_name"
th:replace="layout/location :: fragment_name"
th:src="@{/source.type}"
th:href="@{/ref.place}"
th:if="${something}"
th:action="@{/action/mapping}"
th:field="*{objectAttribute}"
```

4. Steps
```
1. Domain
@Data
@Entity
@Table(name="tablename")
implements Serializable
private static final long serialVersionUID = 1L
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Attributes, getters, setters, constructor

2. Dao
interface -> extends JpaRepository <domain, Long>

3. Service <-> ServiceImpl
interface -> ServiceImpl functions

4. ServiceImpl <-> Service
@Service
implements Service
@Autowired
private dao

@Override
@Transactional
functions

5. Controller
@Controller
@Slf4j
class
@Autowired
private Service
@Mapping -> Post/Get
model
```

JpaRepository cheetcode:
```
dao.findById(getId()).orElse(null)
dao.save()
dao.delete()
dao.findAll() -> List
```

