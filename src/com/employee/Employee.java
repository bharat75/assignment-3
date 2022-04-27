package com.employee;

public class Employee {
	int id;
	String firstName;
	String lastName;
	int salary;
	int newSal;

	public int getNewSal() {
		return newSal;
	}
	
	public Employee(int newSal) {
		this.newSal = newSal;
	}

	public void setNewSal(int newSal) {
		this.newSal = newSal;
	}

	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getName()
	{
		return(firstName+" "+lastName);
	}
	public int getAnnualSalary()
	{
		return salary*12;
	}
	public int raiseSalary(int percent)
	{
		this.newSal = this.salary+(percent/100)*this.salary;
		return this.newSal; 
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}
	

}
