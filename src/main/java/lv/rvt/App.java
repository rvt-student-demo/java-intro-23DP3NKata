package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                System.out.println("Give a number: " + count);
                System.out.println("Sum of the numbers: " + sum);
                break;
            } 

            sum = sum + number;
            count += 1;
            
        }
    }
}
