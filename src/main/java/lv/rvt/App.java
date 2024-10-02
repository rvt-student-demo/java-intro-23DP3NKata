package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);
        int sum = 0; int count = 0; int countEven = 0; int countOdd = 0;
        while (true) {
            int number = Integer.valueOf(reader.nextLine());
            if (number == -1) {
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + count);
                System.out.println("Average: " + Double.valueOf(sum)/count);
                System.out.println("Even: " + countEven);
                System.out.println("Odd: " + countOdd);
                break;
            } 
            sum = sum + number; count++; 
            if (number % 2 == 0) {
                countEven++; 
            } else if (number % 2 != 0) {
                countOdd++;
            }
        }
    }
}
