package com.orthofx;

import java.util.ArrayList;
import java.util.Scanner;

public class Cows extends Animals {
	String milkquantity;

	public void enter() {
		Scanner read = new Scanner(System.in);
		System.out.println("breed of cows");
		breed = read.next();
		if (details.containsKey(breed)) {
			System.out.println("already exist");
		} else {
			details.put(breed, new ArrayList<String>());
			System.out.println("height of breed of cows");
			height = read.next();
			details.get(breed).add(height);
			System.out.println("color of breed of cow");
			color = read.next();
			details.get(breed).add(color);
			System.out.println("amount of milk given by cow");
			milkquantity = read.next();
			details.get(breed).add(milkquantity);
		}
	}

	public void read() {
		Scanner read = new Scanner(System.in);
		System.out.println("breed of cows");
		breed = read.next();
		if (details.containsKey(breed)) {
			System.out.println("height of breed of cows");
			System.out.println(details.get(breed).get(0));
			System.out.println("color of breed of cow");
			System.out.println(details.get(breed).get(1));
			System.out.println("quantity of milk given by cow");
			System.out.println(details.get(breed).get(2));
		} else
			System.out.println("breed doesnt exist");
	}

	public void edit() {
		Scanner read = new Scanner(System.in);
		System.out.println("breed of cow");
		breed = read.next();
		if (details.containsKey(breed)) {
			System.out.println("1 to edit height");
			System.out.println("2 to edit color");
			System.out.println("3 to edit milk quantity");
			int p = read.nextInt();
			switch (p) {
			case 1:
				System.out.println("new height");
				height = read.next();
				details.get(breed).set(0, height);
				break;
			case 2:
				System.out.println("new color");
				color = read.next();
				details.get(breed).set(1, color);
				break;
			case 3:
				System.out.println("milk quantity");
				milkquantity = read.next();
				details.get(breed).set(2, milkquantity);
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
		breed = read.next();
		if (details.containsKey(breed))
			details.remove(breed);
		else
			System.out.println("breed doesnt exist");
	}
}