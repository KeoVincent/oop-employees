package fr.afpa.employees;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*
Objectif :
L’objectif de ce TP est de concevoir un programme en console basé sur une approche objet et
permettant de gérer (vraiment très basiquement) des salariés d’une entreprise.

Vous allez écrire une classe représentant les salariés d'une entreprise.
Vous pourrez vous aider du PDF disponible sur pour obtenir des informations sur la façon de faire.
*/

class Employee {
	// employee attributes
	private String registrationNumber;
	private String lastName;
	private String firstName;
	private double salary;
	private LocalDate birthDate;
	private final int socialPart;

	// constructor
	public Employee(String registrationNumber, String lastName, String firstName, double salary, int socialPart,
			String birthDate) {
		this.registrationNumber = registrationNumber;
		this.lastName = lastName;
		this.firstName = firstName;
		this.salary = salary;
		this.socialPart = socialPart;
		this.birthDate = LocalDate.parse(birthDate);
	}

	@Override
	public String toString() {
		return "Employee \nregistrationNumber = " + registrationNumber
				+ ", \nlastName = " + lastName
				+ ", \nfirstName = " + firstName
				+ ", \nfullName = " + getFullName()
				+ ", \nsalary = " + salary
				+ ", \nsocialPart = " + socialPart
				+ ", \nbirthDate = " + birthDate
				+ ", \nnetSalary = " + getNetSalary()
				+ ", \ndaysUntilBirthday = " + daysUntilBirthday(birthDate)
				+ ", \nisRegistrationNumber = " + checkRegistrationNumber(registrationNumber)
				+ ", \nisName = " + checkName(getFullName());
				//+ ", \nisDate = " + checkDate(birthDate);
	}


	// methods
	public long daysUntilBirthday(LocalDate birthDate) {

		LocalDate currentDate = LocalDate.now();
		LocalDate nextBirthday = birthDate.withYear(currentDate.getYear());

		if (nextBirthday.isBefore(currentDate) || nextBirthday.isEqual(currentDate)) {
			nextBirthday = nextBirthday.plusYears(1);
		}

		return ChronoUnit.DAYS.between(currentDate, nextBirthday);
	}

	public boolean checkRegistrationNumber (String registrationNumber) {
		
		boolean flag = false;
		if (registrationNumber.length() != 7) {
			return false;
		}
		for (int i = 0; i < registrationNumber.length(); i++) {
			char ch = registrationNumber.charAt(i);
			if (i == 0 || i == 1 || i == 5 || i == 6) {
				if (Character.isDigit(ch) == true) {
					flag = true;
				} else {
					return false;
				}
			} else {
				if (Character.isLetter(ch) == true) {
					flag = true;
				} else {
					return false;
				}
			}
		}
		return flag;
	}

	public boolean checkDate (String birthDate) {
		
		boolean flag = false;
		for (int i = 0; i < birthDate.length(); i++) {
			char ch = birthDate.charAt(i);
			if (i == 0 || i == 1 || i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 9) {
				flag = Character.isDigit(ch);
			} else {
				return false;
			}
		}
		return flag;
	}

	public boolean checkName(String fullName) {

		boolean flag = false;
		String str = fullName.replaceAll("\\s", "fullName");
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				flag = true;
			} else {
				return false;
			}
		}
	

		return flag;
	}

	// getters
	public double getNetSalary() {
		return salary - (0.3 * salary);
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

	public LocalDate getbirthDate() {
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

	public void setBirthDate(String birthDate) {
		this.birthDate = LocalDate.parse(birthDate);
	}

}
