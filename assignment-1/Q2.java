import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		int samoosa=10;
		int idli=15;
		int vadaPav=20;
		int c=0;
		int n ;
		int totalbill=0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("enter choice");
			System.out.println("0.exit");
			System.out.println("1.samoosa");
			System.out.println("2.idli");
			System.out.println("3.vadapav");
			System.out.println("4.genrate bill");
			
			c=sc.nextInt();
			switch (c) {
			
			case 1:
				 System.out.println("enter quality of samoosa");
				 n=sc.nextInt();
				 totalbill=(n*10)+totalbill;
				 
				break;
				
			case 2:
				 System.out.println("enter quality of idli");
				 n=sc.nextInt();
				 totalbill=(n*idli)+totalbill;
				 
				break;
				
			case 3:
				 System.out.println("enter quality of vadaPav");
				 n=sc.nextInt();
				 totalbill=(n*vadaPav)+totalbill;
				 
				break;
				
			case 4:
				 System.out.println("Genrate bill");
				 System.out.println("totalbill="+totalbill);
				 System.exit(11);
				 
				 
				break;
				
			case 0:
				System.out.println("thank you visit again");
				System.exit(11);
				

			default:
				break;
			}
			
			
		} while (c!=0);

	}

}
