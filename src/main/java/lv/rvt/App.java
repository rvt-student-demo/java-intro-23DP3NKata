package lv.rvt;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;
        System.out.println(Arrays.toString(numbers));
        swap(numbers, 2, 4);
        System.out.println(Arrays.toString(numbers));
    }

    public static void swap(int[] numbers, int num1, int num2) {
        int helper = numbers[num1];
        numbers[num1] = numbers[num2];
        numbers[num2] = helper;
    }
}