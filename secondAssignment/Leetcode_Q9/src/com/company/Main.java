package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s1 = "the sky is blue";
        System.out.println(reverseWords(s1));

        String s2 = "  hello world  ";
        System.out.println(reverseWords(s2));

        String s3 = "a good   example";
        System.out.println(reverseWords(s3));
    }

    public static String reverseWords(String s) {
        s = s.trim();
        StringBuilder answer = new StringBuilder();
        int i = s.length() - 1, j = s.length() - 1;
        while(i >= 0) {
            while(i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            answer.append(s.substring(i + 1, j + 1) + " ");
            while(i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            j = i;
        }
        return answer.toString().trim();
    }
}
