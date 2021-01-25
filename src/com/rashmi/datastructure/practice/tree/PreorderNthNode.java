package com.rashmi.datastructure.practice.tree;

import java.util.LinkedList;
import java.util.Queue;

public class PreorderNthNode {
	
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

	public static void preOrderTraversal(TreeNode root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+" ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}

	
public static void nthPreOrder(TreeNode root,int n) {
		
		if(root == null) {
			return ;
		}
		 
	    if (count <= n) {  
	    	 count++;  
		        if (count == n)  
		            System.out.println("preorder : "+root.data);  
		    
	    	nthPreOrder(root.left, n);  
	       
	        nthPreOrder(root.right,n); 
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
		
		
		preOrderTraversal(root);
		System.out.println();
		System.out.println();
		nthPreOrder(root,5);
	}

}
