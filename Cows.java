package com.orthofx;

import java.util.ArrayList;
import java.util.Scanner;

public class Cows extends Animals {
	String height, color, breed;

	public static void enter() {
		Scanner read = new Scanner(System.in);
		System.out.println("breed of cows");
		cow.breed = read.next();
        details.put(cow.breed, new ArrayList<String>());
		System.out.println("height of breed of cows");
		dogs.height = read.next();
		details.get(cow.breed).add(cow.height);
		System.out.println("color of breed of cow");
		dogs.color = read.next();
		details.get(cow.breed).add(cow.color);
	}

	public static void read() {
		Scanner read = new Scanner(System.in);
		System.out.println("breed of cows");
		cow.breed = read.next();
		if(details.containsKey(cow.breed)) {
		System.out.println("height of breed of cows");
		System.out.println(details.get(cow.breed).get(0));
		System.out.println("color of breed of cow");
		System.out.println(details.get(cow.breed).get(1));
		}
		else
			System.out.println("breed doesnt exist");
	}

	public static void edit() {
		Scanner read = new Scanner(System.in);
		System.out.println("breed of cow");
		cow.breed = read.next();
		if(details.containsKey(cow.breed)) {
		System.out.println("1 to edit height");
		System.out.println("2 to edit color");
		int p = read.nextInt();
		switch (p) {
		case 1:
			System.out.println("new height");
			cow.height = read.next();
			details.get(cow.breed).add(0, cow.height);
			break;
		case 2:
			System.out.println("new color");
			cow.color = read.next();
			details.get(cow.breed).add(1, cow.color);
			break;
		default:
			System.out.println("invalid choice");
			break;
		}
		}
		else
			System.out.println("breed doesnt exist");
	}
	
	public static void remove() {
		Scanner read = new Scanner(System.in);
			System.out.println("breed of cow");
			cow.breed = read.next();
			if(details.containsKey(cow.breed)) 
			details.remove(cow.breed);
			else
				System.out.println("breed doesnt exist");
	}
}