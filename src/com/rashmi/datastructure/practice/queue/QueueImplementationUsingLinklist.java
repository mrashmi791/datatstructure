package com.rashmi.datastructure.practice.queue;

import java.util.Scanner;

class Queue {
	Queue  next;
	int data;
	Queue(int data) {
		this.data = data;
		this.next = null;
	}
}
public class QueueImplementationUsingLinklist {

	public static Queue rear = null;
	public static Queue front = null;
	
	public static void enQueue(int data) {
		Queue node = new Queue(data);
		if(rear == null) {

			front = node;
		} else {
			rear.next = node;
		}
		

		rear = node;
		
	}
	
	public static void traverse() {
		Queue temp = front;
		while(temp != null) {
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
		
	}
	
	public static boolean isEmpty() {
		return front == rear;
	}
	
	public static void deQueue() {
		if(isEmpty()) {
			return;
		} else {
			Queue d = front; 
			front = front.next;
			d.next = null;
			
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for(int i = 0; i < size;i++) {
			enQueue(sc.nextInt());
		}
		traverse();
		deQueue();
		System.out.println();
		traverse();
	}

}
