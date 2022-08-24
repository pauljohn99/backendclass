package com.orthofx;

import java.util.ArrayList;
import java.util.Scanner;

public class Dog extends Animals {
	String use;

	public void dogenter() {
		Scanner read = new Scanner(System.in);
		System.out.println("use of dog");
		dogs.use = read.next();
		details.get(breed).add(use);
	}

	

	public void dogread() {
		Scanner read = new Scanner(System.in);

		System.out.println("use of dog");
		System.out.println(details.get(breed).get(2));

	}

	public void dogedit() {
		Scanner read = new Scanner(System.in);
		System.out.println("new use");
		use = read.next();
		details.get(breed).set(2, use);

	}
}