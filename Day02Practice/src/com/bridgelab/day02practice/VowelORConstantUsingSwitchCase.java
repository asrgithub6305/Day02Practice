package com.bridgelab.day02practice;

import java.util.Scanner;

public class VowelORConstantUsingSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value");
        char z = scanner.nextLine().charAt(0);

        switch (z) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("This character is vowel" + z);
                break;
            default:
                System.out.println("This character is constant");

        }
    }
}