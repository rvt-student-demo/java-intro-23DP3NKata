package lv.rvt;
import java.util.*;

public class Menu {
    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        if (!this.meals.contains(meal)) {
            this.meals.add(meal);
        }
    }

    public void removeMeal(String meal) {
        if (this.meals.contains(meal)) {
            this.meals.remove(meal);
        } else {
            System.out.println("Meal not found!");
        }
    }

    public void printMeals() {
        if (this.meals.isEmpty()) {
            System.out.println("No meals on the menu.");
        } else {
            for (String meal : this.meals) {
                System.out.println(meal);
            }
        }
    }

    public void clearMenu() {
        this.meals.clear();
    }
}
