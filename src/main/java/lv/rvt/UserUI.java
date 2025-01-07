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
            System.out.println("find name - searches recipes by name");
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                System.out.println("Program stopped.");
                break;
            } else if (command.equals("list")) {
                RecipesManager.listRecipes();
            } else if (command.equals("find name")) {
                System.out.println("Enter recipe name to search: ");
                String name = scanner.nextLine();
                List<Recipe> foundRecipes = RecipesManager.findRecipesByName(name);
                if (foundRecipes.isEmpty()) {
                    System.out.println("No recipes found with name \"" + name + "\".");
                } else {
                    System.out.println("\nFound Recipes: ");
                    for (Recipe recipe: foundRecipes) {
                        System.out.println(recipe);
                    }
                }
            } else {
                System.out.println("Incorrect command!");
            }
        }
    }
}
