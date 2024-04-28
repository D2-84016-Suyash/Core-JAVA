package assignment6;

import java.util.Scanner;

public class BaseSalariedCommissionEmployee extends CommissionEmployee {
	double baseSalary;

	public BaseSalariedCommissionEmployee(String firstname, String lastname, int id, int grossSales,
			double commissionRate, double baseSalary) {
		super(firstname, lastname, id, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}

	public BaseSalariedCommissionEmployee(String firstname, String lastname, int id, int grossSales,
			double commissionRate) {
		super(firstname, lastname, id, grossSales, commissionRate);
	}

	public BaseSalariedCommissionEmployee() {
		// TODO Auto-generated constructor stub
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	

	@Override
	double calSalary() {
		
		return super.calSalary()+baseSalary();
	}

	public double baseSalary() {
		
		return baseSalary*1.1;
	}
	@Override
	public void accept(Scanner sc) {
		
		super.accept(sc);
		System.out.println("enter base salary");
		baseSalary=sc.nextDouble();
	}

	@Override
	public String toString() {
		return "BaseSalariedCommissionEmployee [baseSalary=" + baseSalary + ", grossSales=" + grossSales
				+ ", commissionRate=" + commissionRate + ", total=" + total + ", firstname=" + firstname + ", lastname="
				+ lastname + ", id=" + id + "]"+"salary=" + calSalary()+"newbasesal="+""+baseSalary()  ;
	}
	
}
