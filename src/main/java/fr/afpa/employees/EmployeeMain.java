package fr.afpa.employees;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Classe principale du projet, contient la fonction "main"
 */
class EmployeeMain {
	public static void main(String[] args) {
		System.out.println("\n----- Exercice de programmation objet - classe \"Employee\" -----");

		Employee employee1 = new Employee("11ABC22", "MICHEL", "Michel", 495.0, 30, LocalDate.of(2002, 3, 5));
		Employee employee2 = new Employee("22DEF33", "FRANCOIS", "Françoise", 667.0, 30, LocalDate.of(1999, 10, 25));
		Employee employee3 = new Employee("42WEB52", "TATI", "Daniel", 5000.0, 30, LocalDate.of(1979, 8, 15));
		Employee employee4 = new Employee("420JRTP", "MALIK", "Abdel", 1995.0, 30, LocalDate.of(1984, 7, 7));

		System.out.println(employee1.toString());

	}

}
