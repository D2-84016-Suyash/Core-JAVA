package assignment6;

import java.util.Scanner;

public class tester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int c = 0;
		int counter = 0;
		int n = 0;
		System.out.println("enter size of array");
		n=sc.nextInt();
		Employee[] e = new Employee[n];
		Employee emp =new BaseSalariedCommissionEmployee();
		BaseSalariedCommissionEmployee B=(BaseSalariedCommissionEmployee) emp;

		do {
			System.out.println("1.salaried emp");
			System.out.println("2.hourly emp");
			System.out.println("3.commission emp");
			System.out.println("4.BaseSalariedCommission emp");
			System.out.println("5.Dispaly all emp");
			c=sc.nextInt();
			switch (c) {
			case 1:
				if (counter < n) {
					e[counter]=new SalariedEmployee();
					e[counter].accept(sc);
					counter++;
				}else {
					System.out.println("array is full");
				}

				break;
			case 2:
				if (counter < n) {
					e[counter]=new HourlyEmployee();
					e[counter].accept(sc);
					counter++;
				}else {
					System.out.println("array is full");
				}

				break;

			case 3:
				if (counter < n) {
					e[counter]=new CommissionEmployee();
					e[counter].accept(sc);
					counter++;
				}else {
					System.out.println("array is full");
				}
				break;
			
			case 4:
				if (counter < n) {
					e[counter]=new BaseSalariedCommissionEmployee();
					e[counter].accept(sc);
					counter++;
				}else {
					System.out.println("array is full");
				}
				break;
			
			case 5:
				for(Employee elements:e)
				{
					System.out.println(elements.toString());
					System.out.println();
					
					
					
				}
				
			default:
				break;
			}
		} while (c != 0);

	}

}
