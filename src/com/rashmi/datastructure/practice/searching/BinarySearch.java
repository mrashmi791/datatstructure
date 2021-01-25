package com.rashmi.datastructure.practice.searching;

import java.util.Scanner;

public class BinarySearch {

/**
 * 
 *Binary search using loop....
 */
	
	public static int binarySearch(int arr[], int low, int high, int value) {
		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] == value) {
				return mid;
			} else if (arr[mid] < value) {
				low = mid + 1;

			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	/**
	 * 
	 * BinarySearch using recursion....
	 */
	
	public static int binarySearchRecursively(int arr[], int low, int high, int value) {
		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] == value) 
				return mid;
			  if (arr[mid] < value) 
				return binarySearchRecursively(arr, mid+1, high, value);
				return binarySearchRecursively(arr, low, mid-1, value);
				
			
		}
		return -1;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int low = 0;
		int high = arr.length - 1;

		System.out.println("Enter element to search...!");
		int value = sc.nextInt();
		int result = binarySearchRecursively(arr, low, high, value);
		if (result == -1) {
			System.out.println("Element not present");
		} else {
			System.out.println("Element found at " + "index " + result);
		}
		sc.close();
	}

}
