# JPA Examples

Este proyecto demuestra diferentes tipos de relaciones en JPA (Java Persistence API) utilizando Spring Boot y PostgreSQL.

## Requisitos previos

- Java 17
- Maven
- PostgreSQL
- IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)

## Configuración de la base de datos

1. Asegúrate de tener PostgreSQL instalado y en ejecución en tu sistema.
2. Crea un esquema llamado `pruebas` en tu base de datos PostgreSQL.
3. Actualiza las credenciales de la base de datos en `src/main/resources/application.properties` si es necesario:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/postgres?currentSchema=pruebas
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
```

## Ejecución del script SQL

Antes de ejecutar la aplicación, debes ejecutar el script SQL que se encuentra en:

```
src/main/resources/-- ONE TO ONE.sql
```

Este script crea las tablas necesarias y carga datos de ejemplo para demostrar:
- Relaciones One-to-One (PERSON y DNI)
- Relaciones One-to-Many (Author y Book)
- Relaciones Many-to-Many (Student, Course y StudentCourse)

Puedes ejecutar este script directamente en tu cliente PostgreSQL favorito (pgAdmin, DBeaver, etc.) o mediante la línea de comandos:

```bash
psql -U tu_usuario -d postgres -f "src/main/resources/-- ONE TO ONE.sql"
```

## Ejecución del proyecto

Una vez configurada la base de datos y ejecutado el script SQL, puedes ejecutar el proyecto con Maven:

```bash
mvn spring-boot:run
```

O desde tu IDE favorito, ejecutando la clase `Lab01Application.java`.

## Estructura del proyecto

El proyecto demuestra diferentes tipos de relaciones en JPA:

1. **One-to-One**: Relación entre PERSON y DNI
2. **One-to-Many**: Relación entre Author y Book
3. **Many-to-Many**: Relación entre Student y Course mediante la tabla intermedia StudentCourse

## Notas

- La configuración `spring.jpa.hibernate.ddl-auto=create-drop` está establecida para recrear las tablas al iniciar la aplicación. Si deseas mantener los datos entre ejecuciones, cambia esta configuración a `update` o `none`.
- Asegúrate de que el esquema `pruebas` exista en tu base de datos PostgreSQL antes de ejecutar la aplicación.