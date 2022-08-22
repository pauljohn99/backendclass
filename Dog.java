package com.orthofx;

import java.util.ArrayList;
import java.util.Scanner;

public class Dog extends Animals {
	String use;

	public void enter() {
		Scanner read = new Scanner(System.in);
		System.out.println("breed of dog");
		ani.breed = read.next();
		details.put(ani.breed, new ArrayList<String>());
		System.out.println("height of dog");
		ani.height = read.next();
		details.get(ani.breed).add(ani.height);
		System.out.println("color of dog");
		ani.color = read.next();
		details.get(ani.breed).add(ani.color);
		System.out.println("use of dog");
		dogs.use = read.next();
		details.get(ani.breed).add(dogs.use);
	}

	public void read() {
		Scanner read = new Scanner(System.in);
		System.out.println("breed of dog");
		ani.breed = read.next();
		if (details.containsKey(ani.breed)) {
			System.out.println("height of dog");
			System.out.println(details.get(ani.breed).get(0));
			System.out.println("color of dog");
			System.out.println(details.get(ani.breed).get(1));
			System.out.println("use of dog");
			System.out.println(details.get(ani.breed).get(2));
		} else
			System.out.println("breed doesnt exist");

	}

	public void edit() {
		Scanner read = new Scanner(System.in);
		System.out.println("breed of dog");
		ani.breed = read.next();
		if (details.containsKey(ani.breed)) {
			System.out.println("1 to edit height");
			System.out.println("2 to edit color");
			System.out.println("3 to edit use");
			int k = read.nextInt();
			switch (k) {
			case 1:
				System.out.println("new height");
				ani.height = read.next();
				details.get(ani.breed).set(0, ani.height);
				break;
			case 2:
				System.out.println("new color");
				ani.color = read.next();
				details.get(ani.breed).set(1, ani.color);
				break;
			case 3:
				System.out.println("new use");
				dogs.use = read.next();
				details.get(ani.breed).set(2, dogs.use);
				break;
			default:
				System.out.println("invalid choice");
				break;
			}
		} else
			System.out.println("breed doesnt exist");
	}

	public void remove() {
		Scanner read = new Scanner(System.in);
		System.out.println("breed of dog");
		ani.breed = read.next();
		if (details.containsKey(ani.breed))
			details.remove(ani.breed);
		else
			System.out.println("breed doesnt exist");
	}
}