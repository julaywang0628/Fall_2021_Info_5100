package com.company;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s1 = "abcabcbb";
        System.out.println(longestSubstring(s1));

        String s2 = "tmmuvwm";
        System.out.println(longestSubstring(s2));
    }

    public static String longestSubstring(String s) {
        if(s.length() == 0 || s == null) {
            return "";
        }

        int left = 0, right = 0;
        String maxString = "";
        int[] count = new int[128];
        while (right < s.length()) {
            while (left < right && count[s.charAt(right) - ' '] > 0) {
                count[s.charAt(left) - ' ']--;
                left++;
            }
            while (right < s.length() && count[s.charAt(right) - ' '] == 0) {
                count[s.charAt(right) - ' ']++;
                right++;
                if (right - left > maxString.length()) {
                    maxString = s.substring(left, right);
                }
            }
        }
        return maxString;
    }
}
