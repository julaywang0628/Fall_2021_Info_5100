package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	//Question 1
        //case 1
        int[] nums1 = {1, 2, 3, 2};
        questionOne(nums1);
        System.out.println("The sum of unique elements is " + questionOne(nums1));
        //case 2
        int[] nums2 = {1, 1, 1, 1, 1};
        questionOne(nums2);
        System.out.println("The sum of unique elements is " + questionOne(nums2));

        //Question 2
        //case 1
        int[] nums3 = {-4, -1, 0, 3, 10};
        questionTwo(nums3);
        System.out.println("The squares are " + questionTwo(nums3));

        //case 2
        int[] nums4 = {-7, -3, 2, 3, 11};
        questionTwo(nums4);
        System.out.println("The squares are " + questionTwo(nums4));

        //Question 3
        //case 1
        int[] arr1 = {2, 3, 4, 2, 2, 3, 5, 7};
        questionThree(arr1);
        System.out.println("The first non repeated integer is " + questionThree(arr1));

        //case 2
        int[] arr2 = {-1, 0, 1};
        questionThree(arr2);
        System.out.println("The first non repeated integer is " + questionThree(arr2));

        //Question 4
        //case 1
        boolean beConstructed = questionFour("a", "b");
        System.out.println("The answer of question 4 is " + beConstructed);

        //case 2
        boolean beConstructed1 = questionFour("aa", "aab");
        System.out.println("The answer of question 4 is " + beConstructed1);

        //Question 5
        //case 1
        boolean beFollowed = questionFive("1A3d4s5t");
        System.out.println("The answer of question 5 is " + beFollowed);

        //case 2
        boolean beFollowed1 = questionFive("A2bb2d4");
        System.out.println("The answer of question 5 is " + beFollowed1);

        //case 3
        boolean beFollowed2 = questionFive("a22");
        System.out.println("The answer of question 5 is " + beFollowed2);

    }

    public static int questionOne(int[]nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int[] map = new int[128];
        int sum = 0;
        for (int num : nums) {
            map[num]++;
        }

        for(int i = 0; i < map.length; i++) {
            if(map[i] == 1) {
                sum += i;
            }
        }
        return sum;
    }

    public static String questionTwo(int[] nums) {
        int[] answer = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            answer[i] = nums[i] * nums[i];
        }
        Arrays.sort(answer);
        return Arrays.toString(answer);
    }

    public static int questionThree(int[] arr) {
        if(arr.length == 1) {
            return arr[0];
        }

        int[] count = new int[arr.length];
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] == arr[i]) {
                    count[i] ++;
                }
            }
        }

        int answer = 0;
        for(int i = 0; i < count.length; i++){
            if(count[i] == 0) {
                answer = arr[i];
                break;
            }
        }
        return answer;
    }

    public static boolean questionFour(String note, String magazine) {
        if(magazine == null || magazine.length() == 0 || magazine.length() < note.length()) {
            return false;
        }

        int[] map = new int[128];
        for(int i = 0; i < magazine.length(); i++) {
            map[magazine.charAt(i)] ++;
        }

        for(int i = 0; i < note.length(); i++) {
            map[note.charAt(i)]--;
        }

        for(int num : map) {
            if(num < 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean questionFive(String str) {
        if(str.length() == 1 || str.isEmpty()) {
            return true;
        }

        for(int i = 0; i < str.length() - 1; i++) {
            if ((Integer.valueOf(str.charAt(i))< 58 && Integer.valueOf(str.charAt(i + 1)) < 58)
                || (Integer.valueOf(str.charAt(i)) >= 65 && Integer.valueOf(str.charAt(i + 1)) >= 65)) {
                return false;
            }
        }
        return true;
    }
}
