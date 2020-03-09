package com.rashmi.datastructure.practice.queue;

import java.util.Scanner;


public class QueueDemoBasedOnArray {
	static int rear = -1;
	static int front = 0;
	
	public static void enQueue(int data,int arr[]) {
		if(rear >=  arr.length) {
			System.out.println( "queue is full.....");
			return;
		} 
		
		arr[++rear] = data;
		
	}
	
	public static void traverse(int arr[]) {
		
		for(int i = front;i <= rear;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void deQueue(int arr[]) {
		if(front == rear) {
			System.out.println("empty queue....");
		}
		arr[front] = -1;
		front++;		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 int arr[] = new int [5];
		for(int i = 0; i < 5;i++) {
			enQueue(sc.nextInt(),arr);
			
		}

		traverse(arr);
		deQueue(arr) ;
		System.out.println();
		traverse(arr);
	}

}
