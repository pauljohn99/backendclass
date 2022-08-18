package com.orthofx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Animals {
	static Animals ani = new Animals();
	static Dog dogs = new Dog();
	static Cows cow = new Cows();
	static String name;
	static HashMap<String, ArrayList<String>> details = new HashMap<String, ArrayList<String>>();

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

	

	public static void remove() {
		Scanner read = new Scanner(System.in);
		System.out.println("enter name of animal you want to remove information(dog/cow)");
		ani.name = read.next();
		switch (ani.name) {
		case "dog":
			System.out.println("breed of dog");
			dogs.breed = read.next();
			details.remove(dogs.breed);
			break;
		case "cow":
			System.out.println("breed of cow");
			cow.breed = read.next();
			details.remove(cow.breed);
			break;

		}

	}

	public static void edit() {
		Scanner read = new Scanner(System.in);
		System.out.println("enter name of animal you want to remove information(dog/cow)");
		ani.name = read.next();
		switch (ani.name) {
		case "dog":
			System.out.println("breed of dog");
			dogs.breed = read.next();
			System.out.println("1 to edit height");
			System.out.println("2 to edit color");
			System.out.println("3 to edit height and color");
			int k = read.nextInt();
			switch (k) {
			case 1:
				System.out.println("new height");
				dogs.height = read.next();
				details.get(dogs.breed).add(0, dogs.height);
			case 2:
				System.out.println("new color");
				dogs.color = read.next();
				details.get(dogs.breed).add(1, dogs.color);
			case 3:
				System.out.println("new height");
				dogs.height = read.next();
				details.get(dogs.breed).add(0, dogs.height);
				System.out.println("new color");
				dogs.color = read.next();
				details.get(dogs.breed).add(1, dogs.color);
			}
		case "cow":
			System.out.println("breed of cow");
			cow.breed = read.next();
			System.out.println("1 to edit height");
			System.out.println("2 to edit color");
			System.out.println("3 to edit both height and color");
			int p = read.nextInt();
			switch (p) {
			case 1:
				System.out.println("new height");
				cow.height = read.next();
				details.get(cow.breed).add(0, cow.height);
			case 2:
				System.out.println("new color");
				cow.color = read.next();
				details.get(cow.breed).add(1, cow.color);
			case 3:
				System.out.println("new height");
				cow.height = read.next();
				details.get(cow.breed).add(0, cow.height);
				System.out.println("new color");
				cow.color = read.next();
				details.get(cow.breed).add(1, cow.color);
			}
		}

	}

	public static void read() {
		Scanner read = new Scanner(System.in);
		System.out.println("enter name of animal you want to read information");
		ani.name = read.next();
		switch (ani.name) {
		case "dog":
			System.out.println("breed of dog");
			dogs.breed = read.next();
			System.out.println("height of breed of dog");
			details.get(dogs.breed).get(0);
			System.out.println("color of breed of dog");
			details.get(dogs.breed).get(1);
			break;
		case "cow":
			System.out.println("breed of cows");
			cow.breed = read.next();
			System.out.println("height of breed of cows");
			details.get(cow.breed).get(0);
			System.out.println("color of breed of cow");
			details.get(cow.breed).get(1);
			break;

		}

	}

	public static void enter() {
		Scanner read = new Scanner(System.in);
		System.out.println("1 to enter information for dogs");
		System.out.println("2 to enter information for cows");
		int j = read.nextInt();
		switch (j) {
		case 1:
			System.out.println("breed of dog");
			dogs.breed = read.next();
			details.put(dogs.breed, new ArrayList<String>());
			System.out.println("height of breed of dog");
			dogs.height = read.next();
			details.get(dogs.breed).add(dogs.height);
			System.out.println("color of breed of dog");
			dogs.color = read.next();
			details.get(dogs.breed).add(dogs.color);
			break;
		case 2:
			System.out.println("breed of cows");
			cow.breed = read.next();
			details.put(cow.breed, new ArrayList<String>());
			System.out.println("height of breed of cows");
			dogs.height = read.next();
			details.get(cow.breed).add(cow.height);
			System.out.println("color of breed of cow");
			dogs.color = read.next();
			details.get(cow.breed).add(cow.color);
			break;

		}

	}
}
    Scanner read = new Scanner(System.in);
    System.out.println("do you want to continue");
	char p=read.next().charAt(0);
	while(p=='Y');

	}

}