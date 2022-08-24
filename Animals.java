package com.orthofx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Animals {
	static Animals ani = new Animals();
	static Dog dogs = new Dog();
	static Cows cow = new Cows();
	static String name, breed, height, color;;
	static HashMap<String, ArrayList<String>> details = new HashMap<String, ArrayList<String>>();
	char p1;

	public static void main(String[] args) {
		do {
			Scanner read = new Scanner(System.in);
			System.out.println("1 to enter information");
			System.out.println("2 to read information");
			System.out.println("3 to edit information");
			System.out.println("4 to remove information");

			int i = read.nextInt();
			switch (i) {
			case 1:
				enter();
				break;
			case 2:
				read();
				break;
			case 3:
				edit();
				break;
			case 4:
				remove();
				break;
			default:
				System.out.println("wrong choice");

			}
			Scanner read1 = new Scanner(System.in);
			System.out.println("do you want to continue(y)");
			ani.p1 = read1.next().charAt(0);
		} while (ani.p1 == 'y');
	}

	public static void edit() {
		Scanner read = new Scanner(System.in);
			System.out.println("enter breed");
			breed = read.next();
			System.out.println("1 to edit height");
			System.out.println("2 to edit color");
			int k = read.nextInt();
			switch (k) {
			case 1:
				System.out.println("new height");
				height = read.next();
				details.get(breed).add(0, height);
				break;
			case 2:
				System.out.println("new color");
				color = read.next();
				details.get(breed).add(1, color);
				break;
			default:
				System.out.println("wrong choice");

			}
		}
	

	public static void read() {
		Scanner read = new Scanner(System.in);
		System.out.println("breed of dog");
		dogs.breed = read.next();
		System.out.println("height of breed of dog");
		details.get(dogs.breed).get(0);
		System.out.println("color of breed of dog");
		details.get(dogs.breed).get(1);

	}

	public static void enter() {
		Scanner read = new Scanner(System.in);
		System.out.println("enter breed");
		breed = read.next();
		details.put(breed, new ArrayList<String>());
		System.out.println("height of breed");
		height = read.next();
		details.get(breed).add(height);
		System.out.println("color of breed of cow");
		color = read.next();
		details.get(breed).add(color);
	}

	public static void remove() {
		Scanner read = new Scanner(System.in);
		System.out.println("enter breed");
		breed = read.next();
		details.remove(breed);

	}

}
