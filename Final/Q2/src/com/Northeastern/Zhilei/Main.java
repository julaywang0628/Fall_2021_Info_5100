package com.Northeastern.Zhilei;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[]str1 = new String[] {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(str1));

        String[]str2 = new String[] {""};
        System.out.println(groupAnagrams(str2));

        String[]str3 = new String[] {"a"};
        System.out.println(groupAnagrams(str3));
    }

    public static List<List<String>> groupAnagrams(String[] str) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : str) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String newS = new String(ch);
            List<String> group = map.getOrDefault(newS, new ArrayList<>());
            group.add(s);
            map.put(newS, group);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
