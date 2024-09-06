package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi savu vārdu: ");
        String firstname = scanner.nextLine();

        System.out.println("Ievadi savu uzvardu: ");
        String lastname = scanner.nextLine();

        System.out.println("Ievadi savu grupu: ");
        String group = scanner.nextLine();
        System.out.println("Students: " + firstname + " " + lastname + ", grupa: " + group);

    }
}
