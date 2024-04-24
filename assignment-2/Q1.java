import java.util.Random;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		Random random=new Random();
			int accountNumber=0;
			int	AllowedCredit =0;
			int	totalItemsCharged =0;
			int	totalAllCreditApplied=0;
			int	pendingBalance=0;
			int newBalanceForNextMonth=0;
			
			
			System.out.println("Account number="+random.nextInt(10000));
					
			Scanner sc=new Scanner(System.in);
			System.out.println("enter allowed credit limit");
			AllowedCredit=sc.nextInt();
			System.out.println("enter totalItemsCharged limit");
			totalItemsCharged=sc.nextInt();
			System.out.println("enter totalAllCreditApplied limit");
			totalAllCreditApplied=sc.nextInt();
			System.out.println("enter pendingBalance limit");
			pendingBalance=sc.nextInt();
			
			newBalanceForNextMonth=pendingBalance + totalItemsCharged - totalAllCreditApplied;
			
			if(newBalanceForNextMonth<AllowedCredit) {
			System.out.println("allowed limit"+AllowedCredit);
			}
			else
			{
				System.out.println("Limit Exceeds");
			}
			
			

	}

}
