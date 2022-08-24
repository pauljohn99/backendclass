package com.orthofx;


import java.util.Scanner;

public class Cows extends Animals {
	String milkquantity;

	public void cowenter() {
		Scanner read = new Scanner(System.in);
		System.out.println("amount of milk given by cow");
		milkquantity = read.next();
		details.get(breed).add(milkquantity);
	}

	public void cowread() {
		Scanner read = new Scanner(System.in);
		System.out.println("quantity of milk given by cow");
		System.out.println(details.get(breed).get(2));
	}

	public void cowedit() {
		Scanner read = new Scanner(System.in);
        System.out.println("milk quantity");
		milkquantity = read.next();
		details.get(breed).set(2, milkquantity);

	}

}