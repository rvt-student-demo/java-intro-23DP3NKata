package lv.rvt;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        printStars(9); System.out.println();
        printSquare(4); System.out.println();
        printRectangle(17, 3); System.out.println();
        printTriangle(4);
    }

    public static void printStars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
    public static void printSquare(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println();
            printStars(n);
        }
    }
    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            System.out.println();
            printStars(width);   
        }
    }
    public static void printTriangle(int size) {
        for (int i = 0; i <= size; i++) {
            printStars(i);
            System.out.println();
        }
    }
}