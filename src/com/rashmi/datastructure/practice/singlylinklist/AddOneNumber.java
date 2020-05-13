package com.rashmi.datastructure.practice.singlylinklist;

 class ANode {
	int data;
	ANode  next;
	ANode(int data) {
		this.data= data;
	}
}
 
 /**
  * Add one digit number  to the linked list representation.
  * 
  * @author @Rashmi
  *
  */
public class AddOneNumber {
	
	public static ANode head = null;
	
	public static void addNode(int data) {
		ANode node = new ANode(data);
		
		if(head == null) {
			head = node;
			head.next = null;
		}
		else {
			ANode temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			
		}
		
	}
	
	/**
	 * Printing nodes
	 */
	public static void display() {
		ANode temp = head;
		while(temp != null) {
			System.out.println(temp.data+" ");
			temp = temp.next;
		}
		
		
	}
	
	/**
	 * Reversing list.
	 * 
	 */
	public static void reverse() {
		ANode curr = head;
		ANode next = null;
		ANode prev = null;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			
		}
		head = prev;

	}

	public static void main(String[] args) {
			addNode(5);
			addNode(8);
			addNode(3);
			display();
			reverse();
			System.out.println();
			display();
		

	}

}
