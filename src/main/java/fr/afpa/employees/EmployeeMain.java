package fr.afpa.employees;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Classe principale du projet, contient la fonction "main"
 */
class EmployeeMain
{
	public static void main(String[] args) 
	{
		System.out.println("\n----- Exercice de programmation objet - classe \"Employee\" -----");

		// TODO instanciez 4 objets de la classe "Employee" (une fois celle-ci implémentée)
		Employee employee1 = new Employee("11ABC22", "MICHEL", "Michel", 495.0, 30);
		Employee employee2 = new Employee("22DEF33", "FRANCOIS", "Françoise", 667.0, 30);
		Employee employee3 = new Employee("42WEB52", "TATI", "Daniel", 5000.0, 30);
		Employee employee4 = new Employee("420JRTP", "MALIK", "Abdel", 1995.0, 30);

		employee1.toString();
		

		// TODO afficher les informations des employés avec System.out.println
	}

	// public Employee(String registrationNumber, String lastName, String firstName, double salary, int socialPart);

}

