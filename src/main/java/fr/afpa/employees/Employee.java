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
	private String birthDate;
	private final int socialPart;

	// constructor
	public Employee(String registrationNumber, String lastName, String firstName, double salary, int socialPart,
			String birthDate) {
		this.registrationNumber = registrationNumber;
		this.lastName = lastName;
		this.firstName = firstName;
		this.salary = salary;
		this.socialPart = socialPart;
		this.birthDate = birthDate;
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
				+ ", \nisRegistrationNumber = " + checkRegistrationNumber(registrationNumber);
	}

	// methods
	public long daysUntilBirthday(String strBirthDate) {

		LocalDate localBirthDate = LocalDate.parse(strBirthDate);
		LocalDate currentDate = LocalDate.now();
		LocalDate nextBirthday = localBirthDate.withYear(currentDate.getYear());

		if (nextBirthday.isBefore(currentDate) || nextBirthday.isEqual(currentDate)) {
			nextBirthday = nextBirthday.plusYears(1);
		}

		return ChronoUnit.DAYS.between(currentDate, nextBirthday);
	}

	private boolean checkRegistrationNumber(String registrationNumber) {

		boolean isRegistrationNumber = false;
		if (registrationNumber.length() != 7) {
			return false;
		}
		for (int i = 0; i < registrationNumber.length(); i++) {
			char ch = registrationNumber.charAt(i);
			if (i == 0 || i == 1 || i == 5 || i == 6) {
				if (Character.isDigit(ch)) {
					isRegistrationNumber = true;
				} else {
					return false;
				}
			} else {
				if (Character.isLetter(ch)) {
					isRegistrationNumber = true;
				} else {
					return false;
				}
			}
		}
		return isRegistrationNumber;
	}

	private boolean checkName(String name) throws Exception {

		boolean isName = false;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isLetter(ch) || ch == '-') {
				isName = true;
			} else {
				return false;

			}
		}

		return isName;
	}

	private boolean checkDate(String birthDate) {
		
		boolean isDate = false;

		if (birthDate.length() != 10) {
			return false;
		}

		for (int i = 0; i < birthDate.length(); i++) {
			char ch = birthDate.charAt(i);
			if (Character.isDigit(ch) || ch == '-' || ch == '/') {
				isDate = true;
			} else {
				return false;

			}
		}
		return isDate;
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

	public String getbirthDate() {
		return birthDate;
	}

	// setters
	public void setRegistrationNumber(String registrationNumber) throws Exception {

		if (checkRegistrationNumber(registrationNumber)) {
			this.registrationNumber = registrationNumber;
		} else {
			throw new Exception("Invalid registration number");
		}
	}

	public void setLastName(String lastName) throws Exception {
		if (checkName(lastName)) {
			this.lastName = lastName;
		} else {
			throw new Exception("Name can't include special characters except '-'");
		}
	}

	public void setFirstName(String firstName) throws Exception {
		if (checkName(firstName)) {
			this.firstName = firstName;
		} else {
			throw new Exception("Name can't include special characters except '-'");
		}
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setBirthDate(String birthDate) throws Exception{

		if (checkDate(birthDate)) {
			this.birthDate = birthDate;
		} else {
			throw new Exception("Birth date is not valid");
		}
	}

}
