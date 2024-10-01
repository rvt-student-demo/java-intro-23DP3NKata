package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Last number ");
        int n = Integer.valueOf(reader.nextLine());
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
