# CRUD NoSQL - Laboratorio Spring Boot y MongoDB Atlas

Proyecto de microservicio backend desarrollado en **Spring Boot** con conexión a una base de datos no relacional en la nube (**MongoDB Atlas**), diseñado para cumplir con las operaciones CRUD completas y buenas prácticas de desarrollo.

## Tecnologías Utilizadas
* **Java** (JDK 17+)
* **Spring Boot** (Versión 3.2.5)
* **Spring Data MongoDB**
* **MongoDB Atlas** (Base de datos en la nube)
* **Maven** (Gestor de dependencias y empaquetado)
* **Postman** (Pruebas de endpoints)

## Estructura del Proyecto
* `controller/`: Controladores REST que exponen los endpoints (`/api/productos`).
* `service/`: Lógica de negocio de la aplicación.
* `repository/`: Interfaces de comunicación con MongoDB.
* `model/`: Entidades o modelos de datos (`Producto`).
* `exception/`: Manejo global de excepciones (`GlobalExceptionHandler`).

## Instrucciones de Ejecución Local
1. Clona o descarga este repositorio en tu equipo.
2. Abre el proyecto en **Visual Studio Code**.
3. Asegúrate de configurar tu cadena de conexión en el archivo `src/main/resources/application.properties`.
4. Ejecuta el microservicio utilizando Maven Wrapper desde la terminal:
   ```bash
   .\mvnw spring-boot:run