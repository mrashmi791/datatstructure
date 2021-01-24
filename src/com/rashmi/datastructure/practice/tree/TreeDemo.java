package com.rashmi.datastructure.practice.tree;



/*
 * Tree Data Structure Demo
 */
public class TreeDemo {
	
	public static TreeNode root = null;
	
	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(5);
		root.left= new TreeNode(3);
		root.right = new TreeNode(7);
		root.left.left= new TreeNode(13);
		root.left.right = new TreeNode(17);
		root.right.left = new TreeNode(19);
		root.right.right = new TreeNode(27);
		
		traverse(root);
//		traverse(root);
//		find(root,27);
		System.out.println();
		allMaximum(root,13);
	}
	
	private static void traverse(TreeNode temp) {
		if(temp == null) {
			return;
		}
		traverse(temp.left);
		System.out.print(" "+ temp.data);
		traverse(temp.right);
	}

	
	private static void allMaximum(TreeNode temp,int data) {
		if(temp == null) {
			return;
		}
		if(temp.data > data) {
			System.out.print(temp.data+" ");
		
		}
		allMaximum(temp.left,data);
		allMaximum(temp.right,data);
		
	}

	
	private static void find(TreeNode temp,int data) {
		if(temp == null) {
			return;
		}
		find(temp.left,data);
		find(temp.right,data);
		if(temp.data == data) {
			System.out.print("\nItem Found..: "+ temp.data);
			return;
		}
	}
	
	
	
}
