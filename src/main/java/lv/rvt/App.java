package lv.rvt;

import java.util.Scanner;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(-1);
        list.add(5);
        list.add(1);
        list.add(9);

        printNumbersInRange(list, 0, 5);
        printNumbersInRange(list, 3, 10);
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        System.out.println("The numbers in the range [" + lowerLimit + ", " + upperLimit + "]");
        for (int number: numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
        
    }
}