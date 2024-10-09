package lv.rvt;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;

        System.out.print("Search for? ");
        int number = Integer.valueOf(reader.nextLine());
        int index = -1;
       for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                index = i;
            }
        }
        if (index != -1) {
            System.out.println(number + " is at index " + index);
        } else {
            System.out.println(number + " was not found");
        }
    }
}