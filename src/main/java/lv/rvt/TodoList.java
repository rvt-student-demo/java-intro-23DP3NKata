package lv.rvt;
import java.util.*;

public class TodoList {
    private ArrayList<String> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String task) {
        if (!task.isEmpty()) {
            tasks.add(task);
        } else {
            System.out.println("Task is incorrect");
        }
    }

    public void print() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(String.format("%s. %s", i + 1, tasks.get(i)));
        }
    }

    public void remove(int number) {
        if (number < 1 || number > tasks.size()) {
            System.out.println("Task not found!");
        } else {
            String task = tasks.get(number - 1);
            tasks.remove(task);
            System.out.println(String.format("Task \"%s\" is removed!", task));
        }
    }
}
