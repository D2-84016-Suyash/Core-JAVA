package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of point to be added");
		int d = sc.nextInt();

		Point2D[] arr = new Point2D[d];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter x and y");
			arr[i] = new Point2D(sc.nextInt(), sc.nextInt());
		}

		int c = 0;
		do {

			System.out.println("1.Display details of a specific point");
			System.out.println("2.Display x, y co-ordinates of all points");
			System.out.println("3.User i/p : 2 indices for the points , validate the indices");
			System.out.println("0.exit");
			c = sc.nextInt();
			switch (c) {
			case 0:
				System.out.println("thank you");
				System.exit(11);
				break;

			case 1:
				System.out.println("enter the index of specific point  ");

				int q = sc.nextInt();
				if (q < arr.length) {
					System.out.println(arr[q].getDetails());
				} else {
					System.out.println("array out of bound");
				}
				break;

			case 2:
				for (Point2D element : arr) {
					System.out.println(element.getDetails());
				}
				break;

			case 3:
				System.out.println("calculate distance ");
				System.out.println("enter first points index ");
				int z1 = sc.nextInt();
				System.out.println("enter seconds points index ");
				int z2 = sc.nextInt();
				if (z1 < arr.length && z2 < arr.length) {
					if (arr[z1].isEqual(arr[z2]) == true) {
						System.out.println("points are same");
					}
				} else {
					System.out.println("error");
				}
				break;

			default:
				break;
			}
		} while (c != 0);

	}
}
