package lv.rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Registration registration = new Registration();

        while (true) {
            System.out.println("Izvēlieties darbību: register, remove, show, exit");
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
                    System.out.println("Programma tiek slēgta.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Nepareiza komanda. Lūdzu, mēģiniet vēlreiz.");
            }
        }
    }
}
