package lv.rvt;

import java.util.Scanner;
import java.io.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Registration registration = new Registration();

        while (true) {
            System.out.println(Utils.ANSI_BLUE + "Izvēlieties darbību: register, remove, show, exit" + Utils.ANSI_RESET);
            String command = scanner.nextLine();

            switch (command) {
                case "register":
                    registration.registerStudent();
                    break;
                case "show":
                    registration.showStudents();
                    break;
                case "remove":
                    registration.removeStudent();
                    break;
                case "exit":
                    System.out.println(Utils.ANSI_GREEN + "Programma tiek slēgta.");
                    scanner.close();
                    return;
                default:
                    System.out.println(Utils.ANSI_RED + "Nepareiza komanda. Lūdzu, mēģiniet vēlreiz." + Utils.ANSI_RESET);
            }
        }
    }
}
