package fr.afpa.employees;

import java.time.LocalDate;

/*
Objectif :
L’objectif de ce TP est de concevoir un programme en console basé sur une approche objet et
permettant de gérer (vraiment très basiquement) des salariés d’une entreprise.

Vous allez écrire une classe représentant les salariés d'une entreprise.
Vous pourrez vous aider du PDF disponible sur pour obtenir des informations sur la façon de faire.
*/

class Employee
{
	// employee attributes
	private String registrationNumber;
	private String lastName;
	private String firstName;
	private double salary;
	private final LocalDate birthDate;
	private final int socialPart;

	// constructor
	public Employee(String registrationNumber, String lastName, String firstName, double salary, int socialPart, LocalDate birthDate) {
		this.registrationNumber = registrationNumber;
		this.lastName = lastName;
		this.firstName = firstName;
		this.salary = salary;
		this.socialPart = socialPart;
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Employee \nregistrationNumber = " + registrationNumber + ", \nlastName = " + lastName + ", \nfirstName = "
				+ firstName + ", \nsalary = " + salary + ", \nsocialPart = " + socialPart + ", \nbirthDate = " + birthDate + ", \nnetSalary = " + getNetSalary();
	}


	// getters
	public double getNetSalary() {
		return salary - (0.3*salary);
	}

	public String getFullName() {
		return (firstName + " " + lastName);
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}



	public String getLastName() {
		return lastName;
	}



	public String getFirstName() {
		return firstName;
	}



	public double getSalary() {
		return salary;
	}



	public int getSocialPart() {
		return socialPart;
	}

	public LocalDate getbirthDate () {
		return birthDate;
	}



	// setters
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
