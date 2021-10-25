package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String num1 = "11", num2 = "123";
        System.out.println(addStrings(num1, num2));

        String num3 = "456", num4 = "77";
        System.out.println(addStrings(num3, num4));

        String num5 = "1", num6 = "";
        System.out.println(addStrings(num5, num6));
    }

    public static String addStrings(String num1, String num2) {
        if(num1 == null && num2 != null) {
            return num2;
        }

        if(num1 != null && num2 == null) {
            return num1;
        }

        if(num1 == null && num2 == null) {
            return null;
        }

        StringBuilder answer = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1, j = num2.length() - 1;
        while (i >= 0 || j >= 0) {
            int a;
            int b;
            if(i >= 0) {
                a = num1.charAt(i) - '0';
            } else {
                a = 0;
            }

            if(j >= 0) {
                b = num2.charAt(j) - '0';
            } else {
                b = 0;
            }

            int sum = a + b + carry;
            carry = sum / 10;
            answer.append(sum % 10);
            i--;
            j--;
        }
        if(carry == 1) {
            answer.append(1);
        }
        answer.reverse();
        return answer.toString();
    }
}
