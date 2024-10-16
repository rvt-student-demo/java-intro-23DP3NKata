package student_registration;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Utils {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    private static Path getFilePath(String filename) {
        try {
            URL resourceUrl = App.class.getClassLoader().getResource(filename);
            if (resourceUrl == null) {
                throw new FileNotFoundException("File not found: " + filename);
            }
            return Paths.get(resourceUrl.toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static BufferedReader getReader(String filename) throws IOException {
       return Files.newBufferedReader(getFilePath(filename));
    }

    public static BufferedWriter getWriter(String filename) throws IOException {
       return Files.newBufferedWriter(getFilePath(filename), StandardOpenOption.APPEND);
    }
}
