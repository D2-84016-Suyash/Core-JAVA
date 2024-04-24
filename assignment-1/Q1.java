import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		double d1 = 0,d2=0,avg;
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("enter first number");
		if(sc.hasNextDouble())
		{
			d1=sc.nextDouble();
		}
		else {
			System.out.println("entered number is not double");
			System.exit(11);
		}
		System.out.println("enter second number");
		if(sc.hasNextDouble())
		{
			d2=sc.nextDouble();
		}
		else {
			System.err.println("entered number is not in double ");
			System.exit(11);
			
		}
		
		avg=(d1+d2)/2;
		System.out.println("AVG="+avg);
		

	}

}
