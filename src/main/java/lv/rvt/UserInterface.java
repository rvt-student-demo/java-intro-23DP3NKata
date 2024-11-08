package lv.rvt;
import java.util.*;

public class UserInterface {
    private Scanner scanner;
    private TodoList lists;

    public UserInterface(Scanner scanner, TodoList lists) {
        this.scanner = scanner;
        this.lists = lists;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.print("To add: ");
                String task = scanner.nextLine();
                lists.add(task);
            } else if (command.equals("list")) {
                lists.print();
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed?: ");
                int task = Integer.valueOf(scanner.nextLine());
                lists.remove(task);
            } else {
                System.out.println("Command not found!");
            }
        }
    }
}
