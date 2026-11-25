package com.nt.Array;
import java.util.Arrays;

public class SquaresOfSortedArray {

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (rightSquare > leftSquare) {
                result[i] = rightSquare;
                right--;
            } else {
                result[i] = leftSquare;
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {-4, -1, 0, 3, 10};
        System.out.println("Test 1: " + Arrays.toString(sortedSquares(nums1))); // Expected: [0, 1, 9, 16, 100]

        int[] nums2 = {-7, -3, 2, 3, 11};
        System.out.println("Test 2: " + Arrays.toString(sortedSquares(nums2))); // Expected: [4, 9, 9, 49, 121]
    }
}