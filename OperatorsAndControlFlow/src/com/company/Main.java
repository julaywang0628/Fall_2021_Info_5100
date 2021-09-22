package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 5;
        int b = 5;
        int add = a + b;
        int subtract = a - b;
        int multiply = a * b;
        int divide = a / b;
        int remainder = a % b;

        System.out.println("Add = " + add);
        System.out.println("Subtract = " + subtract);
        System.out.println("Multiply = " + multiply);
        System.out.println("Divide = " + divide);
        System.out.println("Remainder = " + remainder);


        a += 2;
        b -= 1;
        boolean bValue = true;
        bValue = !bValue;
        if(bValue){
            System.out.println("Boolean Value is true ");
        }

        String name = "Julay";
        String lastName = "Wang";
        System.out.println(name);

        name = name + lastName;
        System.out.println(name);
        System.out.println(name.indexOf(1));

    }
}
