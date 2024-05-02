package assignment9;

import java.util.Arrays;

public class tester {

	public static void main(String[] args) {
		students []arr= {
							new students(21,"suyash",100),
							new students(1,"patil",90),
							new students(2,"rohan",91),
							new students(4,"abhi",80),
							new students(23,"virat",200)
		};
		
		Arrays.sort(arr);
		
		for(students element:arr)
			System.out.println(element);
		
		

	}

}
