package com.bridgelab.day02practice;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter month ");
        int m = scanner.nextInt();
        System.out.println("enter date ");
        int d = scanner.nextInt();


        if((m==3 && d>=20) || (m==6 && d<=20) || (m>3 && m < 6)){
            System.out.println("This is a Spring season");
        }
        else{
            System.out.println("This is not a Spring Season");
        }


    }
}
