package com.nt.Array;
import java.util.Arrays;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int k1 = removeDuplicates(nums1);
        System.out.println("Test 1: k = " + k1 + ", array = " + Arrays.toString(Arrays.copyOf(nums1, k1))); // Expected: k = 2, [1, 2]

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = removeDuplicates(nums2);
        System.out.println("Test 2: k = " + k2 + ", array = " + Arrays.toString(Arrays.copyOf(nums2, k2))); // Expected: k = 5, [0, 1, 2, 3, 4]
    }
}