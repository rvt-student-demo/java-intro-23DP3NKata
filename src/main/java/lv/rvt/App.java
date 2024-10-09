package lv.rvt;

import java.util.Scanner;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int j = 0; j < 10; j++) {
            numbers.add(j);
        }

        System.out.println(numbers);

        int smallest = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (smallest > number) {
                smallest = number;
            }
        }
        System.out.println(smallest);
    }
}