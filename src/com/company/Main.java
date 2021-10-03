package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Jefin's Mortgage Calculator");
        Scanner scanner= new Scanner(System.in);
        float years,principle,rate;

            while (true) {
                System.out.print("Enter your principle amount: ");
                principle = scanner.nextFloat();
               if (principle < 1000 || principle > 1000000) {
                   System.out.println("Enter an amount between 1K and 1M");
               }
               else
                   break;
            }


            while (true) {
                System.out.print("Enter the No of Years: ");
                 years = scanner.nextFloat();
                if (years < 0 || years > 30) {
                    System.out.println("Enter a period between 1-30 Years");
                }
                else
                    break;
            }

            while (true) {
                System.out.print("Enter the Rate of Interest in percentage: ");
                 rate = scanner.nextFloat();
                if (rate < 1 || rate > 30) {
                    System.out.println("Enter a value between 1 and 30");
                }
                else
                    break;
            }

            float monthlyInterest = rate / 1200;
            float months = years * 12;

            double mortgage = Math.round(principle*(monthlyInterest*Math.pow(1+monthlyInterest,months)) / ((Math.pow(1+monthlyInterest,months)-1)));

        System.out.println("Your Mortgage is: "+ mortgage);

    }
}

