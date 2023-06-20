package com.bridgelab.day02practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int num = sc.nextInt();
        int a = 0;
        int b =0 ;
        int var = num;
        for (var = num; var>0; var=var/10){
            a = var % 10;
            b = (b*10) + a;
        }
        if(num == b ){
            System.out.println("...The Number Is Palindrome...");
        }
        else{
            System.out.println("...The Number Is Not Palindrome...");
        }
    }
}