package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 David Bradford
 */


import java.util.Scanner;
import java.lang.Math;

public class CompoundInterest
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        int principle,years,times;
        double rate, amt;
        System.out.print( "What is the principle amount? " );
        principle = input.nextInt();
        System.out.print( "What is the rate? " );
        rate = input.nextDouble();
        System.out.print( "What is the number of years? " );
        years = input.nextInt();
        System.out.print( "What is the number of times the interest is compounded per year? " );
        times = input.nextInt();

        amt = principle*Math.pow(1+((rate/100)/times),times*years);

        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.\n", principle,rate,years,times,amt);

    }
}

