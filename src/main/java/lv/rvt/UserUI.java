package lv.rvt;

import java.util.List;
import java.util.Scanner;

public class UserUI {
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        RecipesManager.readFile(fileName);

        while (true) {
            System.out.println("\nCommands:");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                System.out.println("Program stopped.");
                break;
            } else if (command.equals("list")) {
                listRecipes();
            } else {
                System.out.println("Incorrect command!");
            }
        }
    }

    private void listRecipes() {
        List<Recipe> recipes = RecipesManager.getRecipes();
        if (recipes.isEmpty()) {
            System.out.println("No recipes available. Please load a file first.");
        } else {
            System.out.println("\nRecipes:");
            for (Recipe recipe : recipes) {
                System.out.println(recipe);
            }
        }
    }
}
