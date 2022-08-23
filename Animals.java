package com.orthofx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Animals {
   static Animals ani = new Animals();
	static Dog dogs = new Dog();
	static Cows cow = new Cows();
	HashMap<String, ArrayList<String>> details = new HashMap<String, ArrayList<String>>();
	String height, color, breed;

	public static void main(String[] args) {
		char p;
		do {
			Scanner read = new Scanner(System.in);
			System.out.println("1 to enter information");
			System.out.println("2 to read information");
			System.out.println("3 to edit information");
			System.out.println("4 to remove information");

			int i = read.nextInt();
			switch (i) {
			case 1:
				System.out.println("enter animal(dog/cow)");
				String s = read.next();
				switch (s) {
				case "dog":
					dogs.enter();
					break;
				case "cow":
					cow.enter();
					break;
				default:
					System.out.println("invalid option");
				}
				break;
			case 2:
				System.out.println("enter animal(dog/cow)");
				String r = read.next();
				switch (r) {
				case "dog":
					dogs.read();
					break;
				case "cow":
					cow.read();
					break;
				default:
					System.out.println("invalid option");
				}
				break;

			case 3:
				System.out.println("enter animal(dog/cow):");
				String t = read.next();
				switch (t) {
				case "dog":
					dogs.edit();
					break;
				case "cow":
					cow.edit();
					break;
				default:
					System.out.println("invalid option");
				}
				break;
			case 4:
				System.out.println("enter animal(dog/cow):");
				String y = read.next();
				switch (y) {
				case "dog":
					dogs.remove();
					break;
				case "cow":
					cow.remove();
					break;
				default:
					System.out.println("invalid option");
				}
				break;
			default:
				System.out.println("invalid option");
			}

			System.out.println("do you want to continue(y)");

			p = read.next().charAt(0);
		}

		while (p == 'y');
	}

}