package lv.rvt;
import java.util.*;

public class App {

    public static void main(String[] args) {
        JokeManager manager = new JokeManager();
        Scanner scanner = new Scanner(System.in);

        UserUI ui = new UserUI(scanner, manager);
        ui.start();
    }
}
