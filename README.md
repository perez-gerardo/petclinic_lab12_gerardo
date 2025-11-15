# PetClinic Lab 12

Aplicación Spring Boot de PetClinic para el Laboratorio 12 - Pruebas y Funcionalidad.

## Descripción

Este proyecto implementa una aplicación de gestión de clínica veterinaria (PetClinic) con pruebas unitarias y de integración completas.

## Tecnologías

- Java 17
- Spring Boot 3.5.6
- Maven
- JUnit 5
- Mockito
- H2 Database (para tests)

## Información del Proyecto

- **GroupId**: `com.gerardo`
- **ArtifactId**: `petclinic-lab12`
- **Versión**: `0.0.1-SNAPSHOT`
- **Paquete base**: `com.gerardo.petclinic`

## Ejecutar Tests

```bash
mvn clean test -Dspring.profiles.active=h2
```

## Ejecutar Aplicación

```bash
mvn clean install
mvn spring-boot:run
```

## Autor

Gerardo
