package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char[] ch1 = {'a','a','b','b','c','c','c'};
        System.out.println(compress(ch1));

        char[] ch2 = {'a'};
        System.out.println(compress(ch2));

        char[] ch3 = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(ch3));
    }

    public static int compress(char[] chars) {
        int count = 0;
        for(int i = 0; i < chars.length;) {
            int j = i;
            while(j < chars.length && chars[i] == chars[j]) {
                j++;
            }
            chars[count] = chars[i];
            count++;
            if(j - i > 1) {
                String frequency = Integer.toString(j - i);
                for(int k = 0; k < frequency.length(); k++) {
                    chars[count] = frequency.charAt(k);
                    count++;
                }
            }
            i = j;
        }
        return count;
    }
}
