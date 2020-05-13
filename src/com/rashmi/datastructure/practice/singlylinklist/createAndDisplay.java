package com.rashmi.datastructure.practice.singlylinklist;

import java.util.Scanner;

class Node {
	int data;
	Node next;
	Node(int data) {
		this.data = data;
		this.next = null;
	}
	
}

public class createAndDisplay {
	
	public static Node head ;
	
	public static void create (int d) {
		
		Node node = new Node(d);
		if(head == null) {
			head = node;
			return;
		} else {
			node.next = head;
			head = node;
		}
		
		
	}
	
	public static void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-> ");
			temp = temp.next;
		}
	}
	
//	public static void display(Node rev1) {
//		Node temp = rev1;
//		while (temp != null) {
//			System.out.print(temp.data + "-> ");
//			temp = temp.next;
//		}
//
//		
//	}
	
//	public static Node reverse(Node head1) {
//		Node t = head1;
//		Node prev = null;
//		Node next = null;
//		while(t != null) {
//			next = t.next;
//			t.next = prev;
//			prev = t;
//			t = next;
//		}
//		head = prev;
//		return head;
//		
//	}
//	
//	public static Node add(Node rev1,Node rev2) {
//		Node tmp1 = rev1;
//		Node tmp2 = rev2;
//		while(tmp1 != null) {
//			tmp1.data = tmp1.data+tmp2.data;
//			tmp1 = tmp1.next;
//			tmp2 = tmp2.next;
//		}
//		head = rev1;
//		return head;
//	}
	
	public static void  DeleteNElement(int m, int n) {
		Node current = head;
		if(current == null) {
			return;
		}
		while(current != null ) {
			int tm = m;
			while(tm > 0 && current.next != null) {
//				System.out.print(current.data +" ");
				current = current.next;
				tm--;
			}
			
			int tn = n;
			while(tn > 1 && current.next != null) {
				current.next = current.next.next;
				tn--;
			}
			
			current = current.next;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("enter testcases...");
//		int k = sc.nextInt();
//		Node rev1 = null;
//		Node rev2 = null;
//		for(int j = 1;j <=k;j++) {
			System.out.println("Enter number of node....");
			int n  = sc.nextInt();
			System.out.println("enter value : ");
			for(int i = 1; i <= n;i++) {
				int num = sc.nextInt();
				create(num);
				
			}
			display();
			System.out.println();
			DeleteNElement(2,3);
//			 rev1 = reverse(head);
//			 rev2 = reverse(head);

//		}
//		Node s = add(rev1,rev2);
//		display(s);
//		
	}

}
