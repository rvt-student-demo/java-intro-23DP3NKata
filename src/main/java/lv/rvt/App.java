package lv.rvt;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();
        
        TextUI textUI = new TextUI(scanner, dictionary);
        textUI.start();
    }
}
