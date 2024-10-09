package lv.rvt;

import java.util.Scanner;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(reader.nextLine());
            if (number == 9999) {
                break;
            }
            numbers.add(number);
        }
        System.out.println(numbers);
        if (numbers.size() > 0) {
            int smallest = numbers.get(0); int index_of_smallest = 0;
            for (int i = 1; i < numbers.size(); i++) {
                int value = numbers.get(i);
                if (smallest > value) {
                    smallest = value;
                    index_of_smallest = i;
                }
            }
            System.out.println("Smallest number: " + smallest);
            System.out.println("Found at index: " + index_of_smallest);
        } else {
            System.out.println("List is empty");
        }
    }
}