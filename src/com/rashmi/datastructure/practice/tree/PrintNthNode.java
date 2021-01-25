package com.rashmi.datastructure.practice.tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintNthNode {
	public static TreeNode root = null;
	static int count = 0;
	public static TreeNode insertNode(TreeNode root,int data) {
		if(root == null) {
			root = new TreeNode(data);
			return root;
		} 
		Queue<TreeNode> list = new LinkedList<>();
		list.add(root);
		while(!list.isEmpty()) {
			TreeNode temp = list.peek();
			list.remove();
			if(temp.left == null) {
				temp.left =new TreeNode(data);
				break;
			} else {
				list.add(temp.left);
			}
			if(temp.right == null) {
				temp.right = new TreeNode(data);
				break;
			} else {
				list.add(temp.right);
			}
		}
		return root;
	}

	public static void inOrderTraversal(TreeNode root) {
		if(root == null) {
			return;
		}
		
		inOrderTraversal(root.left);
		System.out.print(root.data+" ");
		inOrderTraversal(root.right);
	}

	public static void nthInorder(TreeNode root,int n) {
		if(root == null) {
			return ;
		}
		 
	    
	    if (count <= n) {  
	    	nthInorder(root.left, n);  
	        count++;  
 
	        if (count == n)  
	            System.out.println("inorder : "+root.data);  
	    
	        nthInorder(root.right,n); 
	    }

	}
	
	
	public static void main(String[] args) {
		
		root = insertNode(root, 5);
		insertNode(root, 15);
		insertNode(root, 51);
		
		insertNode(root, 25);
		insertNode(root, 33);
		insertNode(root, 21);
		insertNode(root, 31);
		insertNode(root, 55);
		
		
		inOrderTraversal(root);
		System.out.println();
		nthInorder(root,2);
		System.out.println();
		
	}
}