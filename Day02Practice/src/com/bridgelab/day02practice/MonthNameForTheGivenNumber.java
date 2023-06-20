package com.bridgelab.day02practice;

import java.util.Scanner;

public class MonthNameForTheGivenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value");

        int num = scanner.nextInt();

        switch (num){
            case 1:
                System.out.println("Month is Jan");
                break;
            case 2:
                System.out.println("Month is Feb");
                break;
            case 3:
                System.out.println("Month is March");
                break;
            case 4:
                System.out.println("Month is April");
                break;
            case 5:
                System.out.println("Month is May");
                break;
            case 6:
                System.out.println("Month is June");
                break;
            case 7:
                System.out.println("Month is July");
                break;
            case 8:
                System.out.println("Month is Aug");
                break;
            case 9:
                System.out.println("Month is Sept");
                break;
            case 10:
                System.out.println("Month is Oct");
                break;
            case 11:
                System.out.println("Month is Nov");
                break;
            case 12:
                System.out.println("Month is Dec");
                break;

        }
    }
}