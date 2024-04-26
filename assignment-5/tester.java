package com.app.fruits;

import java.util.Scanner;

public class tester {

	public static void main(String[] args) {

		int n = 0, counter = 0, c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter basket size");
		n = sc.nextInt();
		Fruits[] basket = new Fruits[n];

		do {
			System.out.println("0.exit");
			System.out.println("1.ADD MANGO");
			System.out.println("2.ADD ORANGE");
			System.out.println("3.ADD APPLE");
			System.out.println("4.DISPLAY Name ALL FRUTIS");
			System.out.println("5.Display name,color,weight , taste of all fresh fruits , in the basket");
			System.out.println("6. Mark a fruit as stale");
			System.out.println("7.Display tastes of all stale(not fresh) fruits in the basket.");
			System.out.println("8. Mark all sour fruits stale");
			c = sc.nextInt();
			switch (c) {
			case 1:
				if (counter < n) {
					basket[counter] = new Mango("Yellow", 100, "Mango", true);
					counter++;
				} else {
					System.out.println("Basket is full");
				}
				break;

			case 2:
				if (counter < n) {
					basket[counter] = new Orange("Orange", 80, "Orange", true);
					counter++;
				} else {
					System.out.println("Basket is full");
				}
				break;

			case 3:
				if (counter < n) {
					basket[counter] = new Apple("red", 70, "APPLE", true);
					counter++;
				} else {
					System.out.println("Basket is full");
				}
				break;

			case 4:
				for (Fruits elements : basket) {
					if (elements != null) {

						System.out.println(elements.getName());
					} else {
						System.out.println("basket is null");
					}
				}
				break;
			case 5:
				for (Fruits elements : basket) {
					if (elements != null) {
						if (elements.isFresh == true) {
							System.out.println(elements.toString());
							System.out.println(elements.Taste());
							System.out.println(elements.isFresh());
							System.out.println();
							System.out.println();
						}
					} else {
						System.out.println("basket is null");
					}
				}
				break;

			case 6:
				System.out.println("enter index to make stale");
				int v = sc.nextInt();
				if (v < n)
					basket[v].setFresh(false);
				break;

			case 7:
				for (Fruits element : basket) {
					if (element != null) {
						if (element.isFresh == false) {
							System.out.println("stale fruits are=");
							System.out.println(element.Taste());

						}
					}
				}
				break;

			case 8:
				for (Fruits elements : basket) {
					String s = elements.Taste();
					if (s == "sour") {
						elements.setFresh(false);
						if (elements.isFresh == false) {
							System.out.println("stale fruits are=");
							System.out.println(elements.Taste());
						}

					}

				}
				break;

			case 0:
				System.out.println("thank you");
				System.exit(11);
				break;

			default:
				break;
			}
		} while (c != 0);

	}

}
