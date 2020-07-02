package com.practice.queue;

class Queue {
	Queue  next;
	int data;
	Queue(int data) {
		this.data = data;
		this.next = null;
	}
}
public class QueueImpl {
	public static Queue rear = null;
	public static Queue front = null;
	

		public static void insert(int d) {
			Queue node = new Queue(d);
			if(rear == null) {

				front = node;
			} else {
				rear.next = node;
			}
			

			rear = node;
			
		}
		
		public static void display() {
			Queue temp = front;
			while(temp != null) {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
		}
		
		
		public static void search(int d) {
			Queue temp = front;
			while(temp != null) { 
				if(temp.data == d) {
				System.out.print(temp.data+" is find ");
				break;
				}
				temp = temp.next;
			}
		}
		
		
		public static boolean isEmpty() {
			return front == rear;
		}
		
		public static void delete() {
			if(isEmpty()) {
				return;
			} else {
				Queue d = front; 
				front = front.next;
				d.next = null;
				
			}
		}
	public static void main(String[] args) {
		insert(5);
		insert(43);
		insert(23);
		display();
		System.out.println();
		search(23);
		System.out.println();
		delete();
		display();
		
	}

}
