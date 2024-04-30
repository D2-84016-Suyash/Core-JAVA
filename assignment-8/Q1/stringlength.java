package assignment_8;

import java.util.Scanner;

public class stringlength {
	Scanner sc=new Scanner(System.in);
	String s;
	int l=0;
	
	void calLength()throws ExceptionLineTooLong {
		System.out.println("enter string");
		s=sc.next();
		l=s.length();
		if(l>80)
		throw new ExceptionLineTooLong("length of the string greater than 80 ");
		System.out.println("string length="+l);
		
		
	}

}
