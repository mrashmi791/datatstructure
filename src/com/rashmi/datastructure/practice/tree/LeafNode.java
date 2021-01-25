package com.rashmi.datastructure.practice.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LeafNode {
	
	public static TreeNode root = null;
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
	public static void leafNode(TreeNode root) {
		if(root == null) {
			return ;
		}
		if (root.left == null && root.right == null)  { 
		        System.out.print(root.data + " ");
		        return; 
		    } 
		      
		    if (root.left != null) 
		        leafNode(root.left); 
		   
		    if (root.right != null) 
		        leafNode(root.right); 

	}
	public static void preOrderTraversal(TreeNode root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+" ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}

	public static void nonLeafNode (TreeNode root) {	
		if(root == null)
			return;
		 if (root != null) {  
			 nonLeafNode(root.left);  
	            if (root.left != null && root.right != null)  
	                System.out.print(root.data+" "); 
	            nonLeafNode(root.right);  
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
		leafNode(root);
		System.out.println();
		nonLeafNode(root);
		
	}

}