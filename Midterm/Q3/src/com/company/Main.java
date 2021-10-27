package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array1 = {};
        System.out.println(repeatedNumberSum(array1));

        int[] array2 = {1, 3, -1, 3, 4, -1};
        System.out.println(repeatedNumberSum(array2));

        int[] array3 = {1, 3, -1, 3, 3, -1};
        System.out.println(repeatedNumberSum(array3));

    }

    public static int repeatedNumberSum(int[] array) {
        int sum = 0;
        if(array.length == 0 || array == null) {
            return 0;
        }

        Arrays.sort(array);
        for(int i = 0; i < array.length; ) {
            for(int j = i; j < array.length;) {
                while(j < array.length && array[j] == array[i]) {
                    j++;
                }
                if(j - i >= 2) {
                    sum += array[i];
                }
                i = j;
            }
        }
        return sum;
    }
}
