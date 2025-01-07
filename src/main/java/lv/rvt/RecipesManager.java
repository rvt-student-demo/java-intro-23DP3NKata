package lv.rvt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecipesManager {
    private static List<Recipe> recipes = new ArrayList<>();

    public static void readFile(String fileName) {
        recipes.clear();

        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine().trim();
                if (name.isEmpty()) {
                    continue;
                }

                int cookingTime = Integer.parseInt(scanner.nextLine().trim());
                List<String> ingredients = new ArrayList<>();

                while (scanner.hasNextLine()) {
                    String ingredient = scanner.nextLine().trim();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    ingredients.add(ingredient);
                }

                recipes.add(new Recipe(name, cookingTime, ingredients));
            }
            System.out.println("File successfully read!");
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid cooking time format in the file.");
        }
    }

    public static List<Recipe> getRecipes() {
        return new ArrayList<>(recipes);
    }

    public static void listRecipes() {
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

    public static List<Recipe> findRecipesByName(String name) {
        List<Recipe> foundRecipes = new ArrayList<>();
        for (Recipe recipe: recipes) {
            if (recipe.getName().toLowerCase().contains(name.toLowerCase())) {
                foundRecipes.add(recipe);
            }
        }
        return foundRecipes;
    }
}
