package fr.afpa.employees;

import java.time.temporal.ChronoUnit;

/**
 * Classe principale du projet, contient la fonction "main"
 */
class EmployeeMain {
	public static void main(String[] args) {
		System.out.println("\n----- Exercice de programmation objet - classe \"Employee\" -----");

		Employee employee1 = new Employee("112BC22", "MICHEL", "Michel", 495.0, 30, "2002-03-05");
		Employee employee2 = new Employee("22DEF33", "FRANCOIS", "Françoise", 667.0, 30, "1999-10-25");
		Employee employee3 = new Employee("42WEB52", "974", "Daniel", 5000.0, 30, "1979-08-15");
		Employee employee4 = new Employee("421JR36", "MALIK", "Abdel", 1995.0, 30, "1984-06-07");

		// try {
		// employee1.setRegistrationNumber("EEAZE88");

        // employee1.setRegistrationNumber("6444433");

        // employee1.setRegistrationNumber("64AZ");

        // employee1.setRegistrationNumber("6");

        // employee1.setRegistrationNumber("");
        
        // employee1.setRegistrationNumber("98ARE54");
		// } catch (Exception e) {

		// 	System.out.println(e.getMessage());
		// 	// TODO: handle exception
		// }
		try {
			employee1.setBirthDate("2002-05-05");			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}

		System.out.println(employee1.toString());



	}

}
