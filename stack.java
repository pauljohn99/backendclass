package com.orthofx;

import java.util.Scanner;

public class stack {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int stack1[] = new int[100];
		int stack2[] = new int[100];
		int top1 = -1, top2 = -1;
		char p;
		do {
			System.out.println("1 to pop and 2 to push");
			int i = read.nextInt();
			switch (i) {
			case 1:
				if (top1 == -1 && top2 == -1)
					System.out.println("stack empty");
				else if (top1 != -1 && top2 == -1) {
					do {
						top2++;
						stack2[top2] = stack1[top1];
						top1--;
					} while (top1 != -1);
					System.out.println(stack2[top2]);
				} else
					System.out.println(stack2[top2]);
					top2--;
				break;
			case 2:
				System.out.println("enter element");
				int j = read.nextInt();
				if(top1<100) {
					top1++;
				stack1[top1] = j;
				}
				else
					System.out.println("stack full");
			}
			System.out.println("to stop press S");
			p = read.next().charAt(0);
		} while (p != 'S');

	}
}