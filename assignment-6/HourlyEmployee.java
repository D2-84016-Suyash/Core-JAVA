package assignment6;

import java.util.Scanner;

public class HourlyEmployee extends Employee {
	double wage;
	double hrs;

	public HourlyEmployee() {
		super();
	}

	public HourlyEmployee(String firstname, String lastname,  double wage, double hrs) {
		super(firstname, lastname);
		this.wage = wage;
		this.hrs = hrs;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHrs() {
		return hrs;
	}

	public void setHrs(double hrs) {
		this.hrs = hrs;
	}

	@Override
	public String toString() {
		return "HourlyEmployee [wage=" + wage + ", hrs=" + hrs + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", id=" + id + "]" + "salary=" + calSalary();
	}

	@Override
	public void accept(Scanner sc) {
		// TODO Auto-generated method stub
		super.accept(sc);
		System.out.println("enter wage");
		wage = sc.nextDouble();

		System.out.println("enter hrs");
		hrs = sc.nextDouble();
	}

	@Override
	double calSalary() {

		if (hrs <= 40) {
			double total = wage * hrs;
			return total;
		} else {
			double extrahrs = hrs - 40;
			double total = wage * 40 + wage * extrahrs * 1.5;
			return total;
		}
	}

}
