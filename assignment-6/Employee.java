package assignment6;

import java.util.Scanner;

abstract class Employee {
	String firstname;
	String lastname;
	int id=0;
	static int idGenrater=0;

	public Employee() {
		id=idGenrater++;
	}

	public Employee(String firstname, String lastname) {

		this.firstname = firstname;
		this.lastname = lastname;
		
		id=idGenrater++;
	}

	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname + ", id=" + id + "]";
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	abstract double calSalary();
	
	

	public void accept(Scanner sc) {
		System.out.println("enter first name");
		firstname = sc.next();
		System.out.println("enter last name");
		lastname = sc.next();
//		System.out.println("enter id");
//		id = sc.nextInt();
	

	}

}
