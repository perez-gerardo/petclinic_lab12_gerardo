package com.gerardo.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Aplicación principal PetClinic para Laboratorio 12
 * Implementación de pruebas unitarias y de integración
 * 
 * @author Gerardo
 * @version 1.0.0
 */
@SpringBootApplication
public class PetClinicApplication {

	/**
	 * Método principal de la aplicación Spring Boot
	 * 
	 * @param args Argumentos de línea de comandos
	 */
	public static void main(String[] args) {
		System.out.println("========================================");
		System.out.println("  PetClinic Lab 12 - Gerardo");
		System.out.println("  Iniciando aplicación...");
		System.out.println("========================================");
		SpringApplication.run(PetClinicApplication.class, args);
	}

}

