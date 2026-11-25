package com.nt.Array;

import java.util.Arrays;

public class TwoSum {
	public static void main(String[] args) {
		
		 int[] nums = {2,7,11,15}; 
		 int target = 9;
		 
		 int[] result = twoSumTwoPointers(nums, target);
	        System.out.println(Arrays.toString(result));
	
	}
	
	public static int[] twoSumTwoPointers(int[] nums, int target) {
		
		int i = 0;
		int j = nums.length-1;
		
		while(i<j) {
			int sum = nums[i]+nums[j];
			
			if(sum == target) {
//				return new int[] {i,j};
				return new int[] {nums[i],nums[j]};
				
			}else if(sum > target) {
				j--;
			}else {
				i++;
				
			}
		}
		
		
		return new int[] {-1,-1};
		
		
	}

}

