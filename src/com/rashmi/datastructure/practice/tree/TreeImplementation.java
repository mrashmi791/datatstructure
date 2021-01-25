package com.rashmi.datastructure.practice.tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeImplementation {
	
	static TreeNode root = null ;
	
	public static void main(String[] args) {

//		TreeNode root = new TreeNode(5);
//		root.left = new TreeNode(12);
//		root.right = new TreeNode(20);
//		root.left.left = new TreeNode(32);
//		root.left.right=new TreeNode(55);
//		root.right.left= new TreeNode(43);
//		root.right.right = new TreeNode(23);
		
		
		root = insertNode(root, 5);
		insertNode(root, 15);
		insertNode(root, 51);
		
		insertNode(root, 25);
		insertNode(root, 33);
		insertNode(root, 21);
		insertNode(root, 31);
		
		preOrderTraversal(root);
		System.out.println();
		levelOrderTraversal(root);
		System.out.println();
		TreeNode rightMostNode = rightMostNode(root);
		System.out.println("right value = "+rightMostNode.data);
		
		int key = 2; 
		 
	    if (searchValue(root, key)) 
	        System.out.println("YES"); 
	    else
	        System.out.println("NO"); 
		
//		System.out.println();
//		traversal(root,"preorder");
//		System.out.println();
//		traversal(root,"inorder");
//		System.out.println();
//		traversal(root,"postorder");
//		
	}
	
	public static TreeNode rightMostNode(TreeNode root) {
		if(root == null) {
			return null;
		}
		TreeNode temp = root;
		while(temp.right != null) {
			temp = temp.right;
		}
		return temp;
	}
	
	public static boolean searchValue(TreeNode root, int d) {
		if (root == null) 
	        return false; 
	 
	    if (root.data == d) 
	        return true;
	    boolean res1 = searchValue(root.left, d); 

	    if(res1) return true; 

	    boolean res2 = searchValue(root.right, d); 
	 
	    return res2; 
	}
	
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
	
	public static void levelOrderTraversal(TreeNode root) {
		if(root == null) {		
			return ;
		} 
		
		Queue<TreeNode> list = new LinkedList<>();
		list.add(root);
		
		while(!list.isEmpty()) {
			TreeNode temp = list.peek();
			list.remove();
			System.out.print(temp.data+" ");
			if(temp.left != null) {
				list.add(temp.left);
			} 
			if(temp.right != null) {
				list.add(temp.right);
			}
			
		}
		
	}
	
	
	
	public static void preOrderTraversal(TreeNode root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+" ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	
	
	
	
	
	public static void traversal(TreeNode root, String type) {
		if(root == null) {
			return;
		}
		if(type.equalsIgnoreCase("preorder")) {
			System.out.print(root.data+" ");
		}
		
		preOrderTraversal(root.left);
		if(type.equalsIgnoreCase("inorder")) {
			System.out.print(root.data+" ");
		}
		preOrderTraversal(root.right);
		if(type.equalsIgnoreCase("postorder")) {
			System.out.print(root.data+" ");
		}
	}

}
