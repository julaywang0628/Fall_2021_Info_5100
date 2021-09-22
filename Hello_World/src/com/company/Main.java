package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] buckets =  new ArrayList[nums.length + 1];
        for(int key: map.keySet()){
            int frequency = map.get(key);
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(key);
        }
        System.out.println(buckets[1]);
    }
}
