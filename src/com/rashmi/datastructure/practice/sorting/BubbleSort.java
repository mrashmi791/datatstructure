package com.rashmi.datastructure.practice.sorting;

import java.util.Scanner;
/*
 * 
 * Author : Rashmi
 * 
 */
public class BubbleSort {
	
//	complexity O(N)
//	Optimized solution
	
	public static void bubbleSort(int arr[], int n) {
		System.out.println(" I am here..");
		int flag = 0;
		for(int i = 0;i < n-1;i++) {
			for(int j = 0; j < n-i-1;j++) {
			if( arr[j] > arr[j+1]) {
				int key = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = key;
				flag = 1;
			}
		}
			if(flag == 0) {
				break;
			}
		}
		
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		bubbleSort(arr,n);
		for(int i = 0;i < n;i++) {
			System.out.print(arr[i]+ " ");
		}
//		 complexity: O(n*n)
		
//		for(int i = 0; i < n;i++) {
//			for(int j = i+1;j< n-i-1;j++) {
//				if(arr[j] > arr[j+1]) {
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
	}

}
