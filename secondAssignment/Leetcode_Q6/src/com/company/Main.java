package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s1 = "egg", t1 = "add";
        System.out.println(isIsomorphic(s1, t1));

        String s2 = "foo", t2 = "bar";
        System.out.println(isIsomorphic(s2, t2));

        String s3 = "banana", t3 = "nanaba";
        System.out.println(isIsomorphic(s3, t3));
    }

    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        if(s == null && t == null) {
            return true;
        }

        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        for(int i = 0; i < s.length(); i++) {
            if(s.indexOf(chars[i]) != t.indexOf(chart[i])) {
                return false;
            }
        }
        return true;
    }
}
