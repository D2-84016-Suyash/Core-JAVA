package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class testPoint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System .in);
		
		System.out.println("enter point p1");
		Point2D p1 = new Point2D(sc.nextInt(),sc.nextInt());
		System.out.println("enter point p2");
		Point2D p2 = new Point2D(sc.nextInt(),sc.nextInt());
		

		System.out.println(p1.getDetails());
		System.out.println(p2.getDetails());
		System.out.println(p1.isEqual(p2));

	}

}
