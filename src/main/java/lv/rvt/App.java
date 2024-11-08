package lv.rvt;
import java.util.*;

public class App {

    public static void main(String[] args) {
        TodoList list = new TodoList();
        Scanner scanner = new Scanner(System.in);
        UserInterface textUI = new UserInterface(scanner, list);

        textUI.start();
    }
}
