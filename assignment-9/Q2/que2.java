package assignment9;

import java.util.Scanner;

public class que2 {
	void checkpalindrome(String s) {


		StringBuffer sb1=new StringBuffer(s);
		
		String s2=new String(sb1.reverse());
		
		if(s.equals(s2))
		{
			System.out.println("is palindrome");
		}else
		{
			System.out.println("is not palindrome");
		}
	}
}
