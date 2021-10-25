package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Sum sum = new Sum();
        System.out.println(sum.add(2,3));
        System.out.println(sum.add(4,9,12));
        System.out.println(sum.add(4, 5.0));
        System.out.println(sum.add(15.5, 5));
        System.out.println(sum.add(1.0, 6.4));
    }
}
