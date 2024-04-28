package assignment6;

import java.util.Scanner;

public class CommissionEmployee extends Employee {
	double grossSales;
	double commissionRate;
	double total;

	

	public CommissionEmployee(String firstname, String lastname, int id, int grossSales, double commissionRate) {
		super(firstname, lastname);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	public int getGrossSales() {
		return (int) grossSales;
	}


	public CommissionEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setGrossSales(int grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	@Override
	double calSalary() {
		total=grossSales*commissionRate/100;
		return total;
	}
	@Override
	public void accept(Scanner sc) {
		
		super.accept(sc);
		System.out.println("enter grosssales");
		grossSales=sc.nextDouble();
		System.out.println("enter commision rate");
		commissionRate=sc.nextDouble();
	}
	@Override
	public String toString() {
		return "CommissionEmployee [grossSales=" + grossSales + ", commissionRate=" + commissionRate + ", total="
				+ total + ", firstname=" + firstname + ", lastname=" + lastname + ", id=" + id +"]" +"salary="+ calSalary() ;
	}

}
