package com.bridgelab.day02practice;

import java.util.Scanner;

public class DisplayNumberToUnitTenHundred {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int three_digit_number, hundreds, tens, ones;
        System.out.print("Enter the value of three digit number: ");

        three_digit_number = in.nextInt();

        in.nextLine();

        ones= three_digit_number%10;
        tens= three_digit_number%100-ones;
        hundreds= three_digit_number%1000-tens-ones;
        hundreds=hundreds/100;
        tens=tens/10;
        System.out.println("Value of hundreds: " + hundreds);
        System.out.println("Value of ones: " + ones);
        System.out.println("Value of tens: " + tens);
    }
}