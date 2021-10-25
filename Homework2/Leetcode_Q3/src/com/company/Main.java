package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums1 = {0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeroes(nums1)));

        int[] nums2 = {0};
        System.out.println(Arrays.toString(moveZeroes(nums2)));

        int[] nums3 = {0,1,4,7,0,8};
        System.out.println(Arrays.toString(moveZeroes(nums3)));
    }

    public static int[] moveZeroes(int[] nums) {
        int nonZeroPointer = 0, p1 = 0;
        while(nonZeroPointer < nums.length) {
            if(nums[nonZeroPointer] != 0) {
                int temp = nums[nonZeroPointer];
                nums[nonZeroPointer] = nums[p1];
                nums[p1] = temp;
                p1++;
            }
            nonZeroPointer++;
        }
        return nums;
    }
}
