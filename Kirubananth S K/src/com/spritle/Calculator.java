package com.spritle;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int num1,num2,val;
        double value;
        Calculator list = new Calculator();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Enter the 1st value: ");
            num1=scanner.nextInt();
            System.out.print("Enter the second value: ");
            num2=scanner.nextInt();
            System.out.println("\n---------Actions-------------\n");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            int choice = scanner.nextInt();
            switch(choice){
                case 1 :
                    val= list.add(num1,num2);
                    System.out.println(val);
                    break;
                case 2 :
                     val=list.subtract(num1,num2);
                    System.out.println(val);
                    break;
                case 3:
                    val=list.multiply(num1,num2);
                    System.out.println(val);
                    break;
                case 4:
                    value=list.divide(num1,num2);
                    if(value==0){
                        System.out.println("It gives arithmeticException,Don't use divider as 0");
                    }
                    else {
                        System.out.println(value);
                    }
                    break;
                case 5: System.exit(0);
            }
        }
    }

    private double divide(float num1, float num2) {
        if(num2==0){
            return 0;
        }
        return num1/num2;

    }

    private int multiply(int num1, int num2) {
         return num1*num2;

    }

    private int subtract(int num1, int num2) {
        return num1-num2;
    }

    private int add(int num1, int num2) {
        return num1+num2;
    }
}
