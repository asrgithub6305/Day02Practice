package com.bridgelab.day02practice;

public class ReverseTheIntegerNumberUsingForLoop {
    public static void main(String[] args) {
        int num = 231;
        int reversed = 0;
        System.out.println("Original Number: " + num);

        for(;num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}