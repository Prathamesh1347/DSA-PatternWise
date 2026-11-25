package com.nt.Array;
import java.util.Arrays;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 2, 3};
        int k1 = removeElement(nums1, 3);
        System.out.println("Test 1: k = " + k1 + ", array = " + Arrays.toString(Arrays.copyOf(nums1, k1))); // Expected: k = 2, [2, 2]

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int k2 = removeElement(nums2, 2);
        System.out.println("Test 2: k = " + k2 + ", array = " + Arrays.toString(Arrays.copyOf(nums2, k2))); // Expected: k = 5, [0, 1, 3, 0, 4]
    }
}