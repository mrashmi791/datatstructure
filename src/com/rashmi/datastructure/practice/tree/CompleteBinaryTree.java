package com.rashmi.datastructure.practice.tree;

import java.util.LinkedList;
import java.util.Queue;

public class CompleteBinaryTree {
	
	static TreeNode root = null;
	
	public static TreeNode insert (TreeNode root,int data) {
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
				temp.left = new TreeNode(data);
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

	public static void completeBinaryTree(TreeNode root) {
		if(root == null)
			return;
		if(root.left == null && root.right == null || root.left != null && root.right != null) {
			System.out.print(root.data+" ");
		}
		completeBinaryTree(root.left);
		completeBinaryTree(root.right);
	}
	
	public static void main(String[] args) {
		root = insert(root, 5);
		insert(root, 15);
		insert(root, 51);
		
		insert(root, 25);
		insert(root, 33);
		insert(root, 21);
		insert(root, 31);	
			
		inOrderTraversal(root);
		System.out.println();
		completeBinaryTree(root);
	
	}

}
