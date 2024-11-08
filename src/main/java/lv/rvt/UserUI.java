package lv.rvt;
import java.util.*;

public class UserUI {
    private Scanner scanner;
    private JokeManager jokes;

    public UserUI(Scanner scanner, JokeManager jokes) {
        this.scanner = scanner;
        this.jokes = jokes;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String command = scanner.nextLine();

            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                jokes.addJoke(joke);
            } else if (command.equals("2")) {
                System.out.println(jokes.drawJokes());
            } else if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                jokes.printJokes();
            } else if (command.equals("X")) {
                break;
            } else {
                System.out.println("Incorrect command!");
            }
        }
    }
}
