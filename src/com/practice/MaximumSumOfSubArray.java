package com.practice;

public class MaximumSumOfSubArray {

	public static void main(String[] args) {

		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		int sum = 0;
		int curr = 0;
		for(int i = 0; i < arr.length;i++) {
//			for(int j = i+1;i < arr.length;j++) {
//				
//			}
			
			
			sum = sum + arr[i];
			if(sum < 0) {
				sum = 0;
			} else if(curr < sum) {
				curr = sum;
				
			}
		}
		System.out.println(curr);
	}

}
