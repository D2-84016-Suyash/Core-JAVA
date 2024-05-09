package com.sunbeam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.lang.model.element.Element;

public class tester {

	public static void main(String[] args) {
		int n = 0;
		System.out.println("enter number of students");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		List<students> s = new ArrayList<students>();

		// students s[] = new students[n];

		int choice = 0, counter = 0;
		do {
			System.out.println("enter choice");
			System.out.println("1. Add Student");
			System.out.println("2. display all students sorted on rollno");
			System.out.println("3. display all students sorted on name");
			System.out.println("4. display all students sorted on marks in desc order");
			System.out.println("5. display all students sorted on course");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				if (counter < n) {

					students s1 = new students();
					s.add(s1.accpet(sc));
					counter++;
				} else {
					System.out.println("list is full");
				}

				break;

			case 2:

				class helperclassforstudents implements Comparator<students> {

					@Override
					public int compare(students o1, students o2) {

						return o1.rollno - o2.rollno;
					}

				}
				helperclassforstudents h1 = new helperclassforstudents();
				s.sort(h1);
				for (students Element : s)
					System.out.println(Element);
				break;

			case 3:
				class helperclassforstudent implements Comparator<students> {

					@Override
					public int compare(students o1, students o2) {

						int diff = (o1.name.compareTo(o2.name));
						return diff;
					}

				}
				helperclassforstudent h2 = new helperclassforstudent();
				s.sort(h2);
				for (students Element : s) {
					System.out.println(Element);
				}
				break;

			case 4:
				class helperclassfor implements Comparator<students> {

					@Override
					public int compare(students o1, students o2) {

						return -(o1.marks - o2.marks);
					}

				}
				helperclassfor h3 = new helperclassfor();
				s.sort(h3);
				for (students Element : s) {
					System.out.println(Element);
				}
				break;

			case 5:
				class helperclass implements Comparator<students> {

					@Override
					public int compare(students o1, students o2) {

						return o1.course.compareTo(o2.course);
					}

				}
				helperclass h4 = new helperclass();
				s.sort(h4);
				for (students Element : s) {
					System.out.println(Element);
				}
				break;

			default:
				break;
			}
		} while (choice != 0);

	}

}
