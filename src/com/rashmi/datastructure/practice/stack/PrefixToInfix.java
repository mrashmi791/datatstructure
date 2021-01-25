package com.rashmi.datastructure.practice.stack;

class SData {
	SData next ;
	String data ;
	SData(String data) {
		this.data = data;
		;
	}
}
public class PrefixToInfix {
	 
	static SData top = null;
	static SData top1 = null;
	
	/*
	 * create stack and push the data...
	 */
	public static void push(String d) {
		SData con = new SData(d);
//		if(top == null) {
//			top = con;
//		} else {
			con.next = top;
			top = con;
//		}
		
	}
	
	/*
	 * print stack data...
	 */
	public static void traverse() {
		SData temp = top;
		while (temp != null) {
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
		
	}
	public static void main(String[] args) {
		push("5");
		push("+");
		push("4");
		push("*");
		push("3");
		traverse();
		
	}

}
