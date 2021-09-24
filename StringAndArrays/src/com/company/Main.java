package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean palindrome = isPalindrome("ababbaba");
        if(palindrome) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("It isn't palindrome");
        }

        boolean anagram = areAnagrams("ABBA", "BABA");
        if(anagram) {
            System.out.println("is");
        } else {
            System.out.println("not");
        }
    }

    private static boolean isPalindrome(String str) {

        if (str == null || str.length() <= 1) {
            return true;
        }

        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            if(arr[start] != arr[end]){
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }

    private static boolean areAnagrams(String str1, String str2) {
        if(str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty()){
            return false;
        }

        if(str1.length() != str2.length()){
            return false;
        }

        int[]arr = new int[128];
        for(int i = 0; i < str1.length(); i++){
            arr[str1.charAt(i)] ++;
            arr[str2.charAt(i)] --;
        }

        for(int i = 0; i < 128; i++){
            if(arr[i] !=0){
                return false;
            }
        }
        return true;
    }
}
