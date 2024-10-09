package lv.rvt;

import java.util.Scanner;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        
        while (true) {
            String name = reader.nextLine();
            if (name == "") {
                break;
            }
            names.add(name);
        }
        System.out.println("Search for?");
        String searching_name = reader.nextLine();
        if (names.contains(searching_name)) {
            System.out.println(searching_name + " was found!");
        } else {
            System.out.println(searching_name + " was not found!");
        }
    }
}