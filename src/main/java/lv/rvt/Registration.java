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
        System.out.print(Utils.ANSI_CYAN + "Ievadiet vārdu: " + Utils.ANSI_RESET);
        String firstName = scanner.nextLine();

        System.out.print(Utils.ANSI_CYAN + "Ievadiet uzvārdu: " + Utils.ANSI_RESET);
        String lastName = scanner.nextLine();

        System.out.print(Utils.ANSI_CYAN + "Ievadiet e-pastu: " + Utils.ANSI_RESET);
        String email = scanner.nextLine();
        if (!Validator.isValidEmail(email)) {
            System.out.println(Utils.ANSI_RED + "Nepareizs e-pasta formāts." + Utils.ANSI_RESET);
            return;
        }

        System.out.print(Utils.ANSI_CYAN + "Ievadiet grupu: " + Utils.ANSI_RESET);
        String group = scanner.nextLine();

        Student student = new Student(firstName, lastName, email, group);
        try {
            CsvManager.saveStudent(student);
            System.out.println(Utils.ANSI_GREEN + "Studenta dati ir saglabāti." + Utils.ANSI_RESET);
        } catch (IOException e) {
            System.out.println(Utils.ANSI_RED + "Radās kļūda, saglabājot datus: " + e.getMessage() + Utils.ANSI_RESET);
        }
    }

    public void showStudents() {
        try {
            List<Student> students = CsvManager.loadStudents();
            System.out.println(Utils.ANSI_YELLOW + "Reģistrētie studenti:" + Utils.ANSI_RESET);
            for (Student student : students) {
                System.out.println(Utils.ANSI_BLACK + student + Utils.ANSI_RESET);
            }
        } catch (IOException e) {
            System.out.println(Utils.ANSI_RED + "Radās kļūda, lasot datus: " + e.getMessage()+ Utils.ANSI_RESET);
        }
    }

    public void removeStudent() {
        System.out.print(Utils.ANSI_CYAN + "Ievadiet e-pastu, lai dzēstu studentu: " + Utils.ANSI_RESET);
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
                System.out.println(Utils.ANSI_GREEN + "Students with email " + email + " have been removed." + Utils.ANSI_RESET);
            } else {
                System.out.println(Utils.ANSI_RED + "Students with email " + email + " not found." + Utils.ANSI_RESET);
            }
        } catch (IOException e) {
            System.out.println(Utils.ANSI_RED + "Radās kļūda, lasot datus: " + e.getMessage() + Utils.ANSI_RESET);
        }
    }
}
