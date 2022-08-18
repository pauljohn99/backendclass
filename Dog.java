package com.orthofx;

import java.util.ArrayList;
import java.util.Scanner;

public class Dog extends Animals {
	String breed, color, height;

	public static void enter() {
		Scanner read = new Scanner(System.in);
		System.out.println("breed of dog");
		dogs.breed = read.next();
		details.put(dogs.breed, new ArrayList<String>());
		System.out.println("height of breed of dog");
		dogs.height = read.next();
		details.get(dogs.breed).add(dogs.height);
		System.out.println("color of breed of dog");
		dogs.color = read.next();
		details.get(dogs.breed).add(dogs.color);
		}
		

	

	public static void read() {
		Scanner read = new Scanner(System.in);
		System.out.println("breed of dog");
		dogs.breed = read.next();
		if(details.containsKey(dogs.breed)) {
		System.out.println("height of breed of dog");
		System.out.println(details.get(dogs.breed).get(0));
		System.out.println("color of breed of dog");
		System.out.println(details.get(dogs.breed).get(1));
		}
		else
			System.out.println("breed doesnt exist");
		
	}

	public static void edit() {
		Scanner read = new Scanner(System.in);
		System.out.println("breed of dog");
		dogs.breed = read.next();
		if(details.containsKey(dogs.breed)) {
		System.out.println("1 to edit height");
		System.out.println("2 to edit color");
		int k = read.nextInt();
		switch (k) {
		case 1:
			System.out.println("new height");
			dogs.height = read.next();
			details.get(dogs.breed).add(0, dogs.height);
			break;
		case 2:
			System.out.println("new color");
			dogs.color = read.next();
			details.get(dogs.breed).add(1, dogs.color);
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
			System.out.println("breed of dog");
			dogs.breed = read.next();
			if(details.containsKey(dogs.breed)) 
			details.remove(dogs.breed);
			else
				System.out.println("breed doesnt exist");
}
}