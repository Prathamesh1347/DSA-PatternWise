package com.nt.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumHashmap {
    public static void main(String[] args) {
        int[] nums = {7, 11, 2, 15}; // Unsorted array
        int target = 9;

        int[] result = twoSumHashMap(nums, target);
        System.out.println(Arrays.toString(result)); // Output: [0, 2]
    }

    public static int[] twoSumHashMap(int[] nums, int target) {
    	Map<Integer, Integer> map = new HashMap<>();
    	
    	for( int i = 0 ; i< nums.length; i++) {
    		int complement = target - nums[i];
    		
    		if(map.containsKey(complement)) {
//    			return new int[] {map.get(complement),i};
    			return new int[] {complement,nums[i]};
    		}
    		map.put(nums[i], i);
    	}
		return new int[] {-1,-1};
      
    }
}
