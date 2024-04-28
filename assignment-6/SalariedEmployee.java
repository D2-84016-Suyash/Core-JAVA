package assignment6;

import java.util.Scanner;

public class SalariedEmployee extends Employee {
	double weekySalary;

	public double getWeekySalary() {
		return weekySalary;
	}

	public void setWeekySalary(double weekySalary) {
		this.weekySalary = weekySalary;
	}

	public SalariedEmployee(String firstname, String lastname, double weekySalary) {
		super(firstname, lastname);
		this.weekySalary = weekySalary;
	}

	public SalariedEmployee() {
		super();
	}

	double calSalary() {

		return getWeekySalary();

	}

	@Override
	public void accept(Scanner sc) {

		super.accept(sc);
		System.out.println("enter weekySalary");
		weekySalary = sc.nextDouble();
	}

	@Override
	public String toString() {
		return "SalariedEmployee [  firstname=" + firstname + ", lastname=" + lastname
				+ ", id=" + id + "]"+"salary="+calSalary();
	}

}
