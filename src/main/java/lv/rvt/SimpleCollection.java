package lv.rvt;
import java.util.*;

public class SimpleCollection {
    private ArrayList<String> collection;
    private String name;

    public SimpleCollection(String name) {
        this.collection = new ArrayList<>();
        this.name = name;
    }

    public void add(String name) {
        if (!name.isEmpty()) {
            collection.add(name);
        }
    }

    @Override
    public String toString() {
        if (collection.isEmpty()) {
            return String.format("The collection %s is empty.", this.name);
        } else {
            return String.format("The collection %s has %s element: %s", this.name, this.collection.size(), String.join(", ", collection));
        }
    }
}
