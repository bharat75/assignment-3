package com.driver;

import com.employee.Employee;
import com.books.Author;
import com.books.Book;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int id = 10;
		String firstName = "Bharat";
		String lastName = "Shubham";
		int salary = 1000;
		int newSal = 10;
		Employee emp2 = new Employee(newSal);
		
		
		Employee emp = new Employee(id, firstName, lastName, salary);
		emp.setId(id);
		emp.setFirstName(firstName);
		emp.setLastName(lastName);
		emp.setSalary(salary);
		System.out.println("Full name of Employee is "+emp.getName());
		System.out.println("The annual salary of Employee is "+emp.getAnnualSalary());
		System.out.println("The increased salary of employee by 10 percent is "+emp2.raiseSalary(10));
	}

}
