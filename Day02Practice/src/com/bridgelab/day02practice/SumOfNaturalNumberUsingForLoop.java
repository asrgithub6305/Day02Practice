package com.bridgelab.day02practice;

public class SumOfNaturalNumberUsingForLoop
{
    public static void main(String[] args)
    {
        int i, num = 5, sum = 0;
//executes until the condition returns true
        for(i = 1; i <= num; ++i)
        {
//adding the value of i into sum variable
            sum = sum + i;
        }
//prints the sum
        System.out.println("Sum of First 10 Natural Numbers is = " + sum);
    }
}
