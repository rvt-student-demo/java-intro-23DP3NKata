package lv.rvt;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Registration {
    private Scanner scanner;

    public Registration() {
        this.scanner = new Scanner(System.in);
    }

    public void registerStudent() {
        System.out.print("Ievadiet vārdu: ");
        String firstName = scanner.nextLine();

        System.out.print("Ievadiet uzvārdu: ");
        String lastName = scanner.nextLine();

        System.out.print("Ievadiet e-pastu: ");
        String email = scanner.nextLine();
        if (!Validator.isValidEmail(email)) {
            System.out.println("Nepareizs e-pasta formāts.");
            return;
        }

        System.out.print("Ievadiet grupu: ");
        String group = scanner.nextLine();

        Student student = new Student(firstName, lastName, email, group);
        try {
            CsvManager.saveStudent(student);
            System.out.println("Studenta dati ir saglabāti.");
        } catch (IOException e) {
            System.out.println("Radās kļūda, saglabājot datus: " + e.getMessage());
        }
    }

    public void showStudents() {
        try {
            List<Student> students = CsvManager.loadStudents();
            System.out.println("Reģistrētie studenti:");
            for (Student student : students) {
                System.out.println(student);
            }
        } catch (IOException e) {
            System.out.println("Radās kļūda, lasot datus: " + e.getMessage());
        }
    }

    public void removeStudent() {
        System.out.print("Ievadiet e-pastu, lai dzēstu studentu: ");
        String email = scanner.nextLine();
        
        try {
            List<Student> students = CsvManager.loadStudents();
            boolean removed = false;
            List<Student> updatedStudents = new ArrayList<>();

            for (Student student : students) {
                if (!student.getEmail().equals(email)) {
                    updatedStudents.add(student);
                } else {
                    removed = true;
                }
            }

            if (removed) {

                CsvManager.saveStudents(updatedStudents);
                System.out.println("Students with email " + email + " have been removed.");
            } else {
                System.out.println("Students with email " + email + " not found.");
            }
        } catch (IOException e) {
            System.out.println("Radās kļūda, lasot datus: " + e.getMessage());
        }
    }
}
