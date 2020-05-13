package com.rashmi.datastructure.practice.singlylinklist;


class BinaryNode {
	int data;
	BinaryNode  next;
	BinaryNode(int data) {
		this.data= data;
	}
}

public class BinaryToDecimal {

public static BinaryNode head = null;

static int count = 0;
static int dec = 0;
	
/*
 * Add node in linkedlist...
 */
	public static void addNode(int data) {
		BinaryNode node = new BinaryNode(data);
		
		if(head == null) {
			head = node;
			head.next = null;
		}
		else {
			BinaryNode temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			
		}
		
	}
	
	/*
	 * Display node of linkedlist...
	 * 
	 */
			
	public static void display() {
		BinaryNode temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		
		
	}
	
	/*
	 * Check linkedlist is circular or not...
	 */
	public static boolean checkCircular(BinaryNode head) {
		BinaryNode temp = head;
		
		
		while(temp != null && temp != head) {
			temp = temp.next;
		}
		
		
		return (temp == head);
		
	}
	
	/*
	 * Reverse the linkedlist..
	 * 
	 */
	public static void reverse() {
		BinaryNode curr = head;
		BinaryNode next = null;
		BinaryNode prev = null;
		
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			
		}
		head = prev;

		
	}
	
	/*
	 * Convert binary to decimal...
	 */
	public static int binaryToDecimal() {
		int count = 0;
		int dec = 0;
		BinaryNode temp = head;
		while(temp != null) {
			dec += temp.data * (int)Math.pow(2, count);
			count++;
			temp = temp.next;
		}
		return dec;
	}
	
	/*
	 * Convert binary to decimal using recursively...
	 */
	public static int binaryToDecimalRecursively(BinaryNode head) {
		if(head == null) {
			return 0;
		}
		
		binaryToDecimalRecursively(head.next);
		dec += head.data * (int)Math.pow(2, count);
		count++;
		return dec;
		
	}
	public static void main(String[] args) {

		addNode(5);
		addNode(6);
		addNode(4);
		addNode(2);
		addNode(5);
//		addNode(0);
//		addNode(0);
//		addNode(1);
//		addNode(0);
		display();
//		reverse();
		System.out.println();
//		display();
	
//		int decimal = binaryToDecimal();
//		System.out.println(binaryToDecimalRecursively(head));
		
		System.out.print(checkCircular(head)?"It's circular ":"It's not circular");
		
	}

}
