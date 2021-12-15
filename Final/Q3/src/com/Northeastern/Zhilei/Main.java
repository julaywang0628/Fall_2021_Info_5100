package com.Northeastern.Zhilei;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums1 = {1,1,1};
        int k1 = 2;
        System.out.println(subarraySum(nums1, k1));

        int[] nums2 = {1,2,3};
        int k2 = 3;
        System.out.println(subarraySum(nums2, k2));
    }

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0, count = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }
        return count;
    }
}
