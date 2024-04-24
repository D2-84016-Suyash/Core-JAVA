import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Total_miles_driven_per_day=0;
	int  Cost_per_gallon_of_gasoline=0;
	double Average_miles_per_gallon=0;
	int Parking_fees_per_day=0;
	int Tolls_per_day=0;
	
	
	System.out.println("enter total km driven per day");
	Total_miles_driven_per_day=sc.nextInt();
	System.out.println("enter Cost_per_gallon_of_gasoline");
	Cost_per_gallon_of_gasoline=sc.nextInt();
	System.out.println("enter Average_miles_per_gallon");
	Average_miles_per_gallon=sc.nextInt();
	System.out.println("enter Parking_fees_per_day");
	Parking_fees_per_day=sc.nextInt();
	
	System.out.println("enter Tolls_per_day");
	Tolls_per_day=sc.nextInt();
	
	System.out.println("Cost per day of driving to work is"+(((Total_miles_driven_per_day/Average_miles_per_gallon)*Cost_per_gallon_of_gasoline)+Parking_fees_per_day+Tolls_per_day));
	
	
	}

}
