package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class CsvManager {
    private static final String FILE_NAME = "src/main/resources/data.csv";

    public static void saveStudent(Student student) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(FILE_NAME), StandardOpenOption.APPEND)) {
            writer.write(student.toCsvString());
            writer.newLine();
        }
    }

    public static List<Student> loadStudents() throws IOException {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4) {
                    students.add(new Student(data[0], data[1], data[2], data[3]));
                }
            }
        }
        return students;
    }

    public static void saveStudents(List<Student> students) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(FILE_NAME), StandardOpenOption.TRUNCATE_EXISTING)) {
            for (Student student : students) {
                writer.write(student.toCsvString());
                writer.newLine();
            }
        }
    }
}