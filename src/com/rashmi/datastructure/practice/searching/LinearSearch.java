package com.rashmi.datastructure.practice.searching;

import java.util.Scanner;

public class LinearSearch {
	
	public static int linearSearch(int values[], int target, int n)	{
	    for(int i = 0; i < n; i++)  {
	        if (values[i] == target) {       
	            return i; 
	        }
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
		System.out.println("Enter value for searching...");
		int target = sc.nextInt();
		int res = linearSearch(arr,target,n);
		System.out.println("Result... "+ res); 
		sc.close();
	}

}
