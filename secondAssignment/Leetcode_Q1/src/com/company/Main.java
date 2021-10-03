package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] test1 =  {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString((transpose(test1))));

        int[][] test2 =  {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString((transpose(test2))));

        int[][] test3 =  {{2,4,-1},{-10,5,11},{18,-7,6}};
        System.out.println(Arrays.deepToString((transpose(test3))));

    }

    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] answer = new int[n][m];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                answer[j][i] = matrix[i][j];
            }
        }
        return answer;
    }
}
