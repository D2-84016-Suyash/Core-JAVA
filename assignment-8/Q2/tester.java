import java.util.Scanner;

public class tester {

	public static void main(String[] args) {
		circle c1 =new circle();
		
		Scanner sc =new Scanner(System.in);
		try {
			c1.accpet(sc);
		}catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("inside finally");
			sc.close();
		}
		
		
		
		
		

	}

}
