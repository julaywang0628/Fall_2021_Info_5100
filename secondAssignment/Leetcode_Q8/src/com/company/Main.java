package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s1));

        String s2 = "race a car";
        System.out.println(isPalindrome(s2));

        String s3 = "A man1 a p: Pa2nama";
        System.out.println(isPalindrome(s3));
    }

    public static boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        StringBuilder target = new StringBuilder();
        for(char ch : chars) {
            if(Character.isLetterOrDigit(ch)) {
                target.append(Character.toLowerCase(ch));
            }
        }
        int i = 0, j = target.length() - 1;
        while(i <= j) {
            if(target.charAt(i) != target.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
