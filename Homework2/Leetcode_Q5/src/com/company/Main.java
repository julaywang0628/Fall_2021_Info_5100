package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix1));

        int[][] matrix2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(matrix2));

        int[][] matrix3 = {{1},{2}};
        System.out.println(spiralOrder(matrix3));
    }


    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        if(m == 0 || n == 0) {
            return answer;
        }

        int top = 0, left = 0, bottom = m - 1, right = n - 1;
        while(top <= bottom && left <= right) {
            for(int i = left; i <= right; i++) {
                answer.add(matrix[top][i]);
            }
            top++;
            for(int i = top; i <= bottom; i++) {
                answer.add(matrix[i][right]);
            }
            right--;
            if(top > bottom || right < left) {
                break;
            }
            for(int i = right; i >= left; i--) {
                answer.add(matrix[bottom][i]);
            }
            bottom--;
            for(int i = bottom; i >= top; i--) {
                answer.add(matrix[i][left]);
            }
            left++;
        }
        return answer;
    }
}
