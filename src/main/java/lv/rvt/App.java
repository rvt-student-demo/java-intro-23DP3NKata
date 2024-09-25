package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        //Scanner scanner = new Scanner(System.in);

        // System.out.println("Give speed:");
        // int value = Integer.valueOf(scanner.nextLine());

        // if (value > 120) {
        //     System.out.println("Speeding ticket!");
        // }


        //// Grades and Points ////
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Give points [0-100]:");

        // int grade = Integer.valueOf(scanner.nextLine());
        // if (grade < 0) {
        //     System.out.println("Grade: impossible!");
        // } else if (grade >= 0 && grade <= 49)  {
        //     System.out.println("Grade: failed");
        // } else if (grade >= 50 && grade <= 59) {
        //     System.out.println("Grade: " + 1);
        // } else if (grade >= 60 && grade <= 69) {
        //     System.out.println("Grade: " + 2);
        // } else if (grade >= 70 && grade <= 79) {
        //     System.out.println("Grade: " + 3);
        // } else if (grade >= 80 && grade <= 89) {
        //     System.out.println("Grade: " + 4);
        // } else if (grade >= 90 && grade <= 100) {
        //     System.out.println("Grade: " + 5);
        // } else {
        //     System.out.println("Grade: incredible!");
        // }


        Scanner reader = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(reader.nextLine());
        double tax = 0;

        if ( value >= 1000000) {
            tax = 142100 + (value-1000000) * 0.17;
            System.out.println("Tax: " + tax);

        } else if (value < 1000000 && value >= 200000) {
            tax = 22000 + (value-200000) * 0.15;
            System.out.println("Tax: " + tax);

        } else if (value < 200000 && value >= 55000) {
            tax = 4700 + (value-55000) * 0.12;
            System.out.println("Tax: " + tax);

        } else if (value < 55000 && value >= 25000) {
            tax = 1700 + (value-25000) * 0.10;
            System.out.println("Tax: " + tax);

        } else if (value < 25000 && value >= 5000) {
            tax = 100 + (value-5000) * 0.8;
            System.out.println("Tax: " + tax);

        } else {
            System.out.println("No tax!");
        }
    }
}
