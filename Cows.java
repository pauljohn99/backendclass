package com.orthofx;

import java.util.ArrayList;
import java.util.Scanner;

public class Cows extends Animals {
	String milkquantity;

	public void enter() {
		Scanner read = new Scanner(System.in);
		System.out.println("breed of cows");
		ani.breed = read.next();
		details.put(ani.breed, new ArrayList<String>());
		System.out.println("height of breed of cows");
		ani.height = read.next();
		details.get(ani.breed).add(ani.height);
		System.out.println("color of breed of cow");
		ani.color = read.next();
		details.get(ani.breed).add(ani.color);
		System.out.println("amount of milk given by cow");
		cow.milkquantity = read.next();
		details.get(ani.breed).add(cow.milkquantity);
	}

	public void read() {
		Scanner read = new Scanner(System.in);
		System.out.println("breed of cows");
		ani.breed = read.next();
		if (details.containsKey(ani.breed)) {
			System.out.println("height of breed of cows");
			System.out.println(details.get(ani.breed).get(0));
			System.out.println("color of breed of cow");
			System.out.println(details.get(ani.breed).get(1));
			System.out.println("quantity of milk given by cow");
			System.out.println(details.get(ani.breed).get(2));
		} else
			System.out.println("breed doesnt exist");
	}

	public void edit() {
		Scanner read = new Scanner(System.in);
		System.out.println("breed of cow");
		ani.breed = read.next();
		if (details.containsKey(ani.breed)) {
			System.out.println("1 to edit height");
			System.out.println("2 to edit color");
			int p = read.nextInt();
			switch (p) {
			case 1:
				System.out.println("new height");
				cow.height = read.next();
				details.get(ani.breed).add(0, ani.height);
				break;
			case 2:
				System.out.println("new color");
				ani.color = read.next();
				details.get(ani.breed).add(1, ani.color);
				break;
			case 3:
				System.out.println("milk quantity");
				cow.milkquantity = read.next();
				details.get(ani.breed).add(2, cow.milkquantity);
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
		System.out.println("breed of cow");
		ani.breed = read.next();
		if (details.containsKey(ani.breed))
			details.remove(ani.breed);
		else
			System.out.println("breed doesnt exist");
	}
}