package com.rashmi.datastructure.practice.stack;

import java.util.Scanner;

public class StackDemoBasedOnArray {
	
	public static int top= 0;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int stack[] = new int[n];
		
		top = n;
		System.out.println("Enter value for add in stack");
		for(int i = 0 ;i < n; i++) {
			int value = sc.nextInt();
			push(value,stack);
		}
		traverse(n,stack);
		System.out.println();
		pop(stack);
		pop(stack);
		traverse(n,stack);
		System.out.println();
		push(101,stack);
		traverse(n,stack);
		sc.close();
	}

	public static void push(int e,int stack[]) {
		if(top > 0) {
			top--;
		}
		stack[top] = e;
		
		
		
	}
	public static void traverse(int n,int stack[]) {
		for(int i = top; i < n ; i++) {
			System.out.print(stack[i]+" ");
		}
		
	}
	public static void pop(int stack[]) {
		if(top < stack.length-1) {
			top++;
		}
	}
}
