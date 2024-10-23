package lv.rvt;
import java.util.*;

public class Stack {
    private ArrayList<String> myList;

    public Stack() {
        this.myList = new ArrayList<>();
    }

    public boolean isEmpty() {
        if (this.myList.size() == 0) {
            return true;
        }
        return false;
    }

    public void add(String value) {
        this.myList.add(value);
    }

    public ArrayList<String> values() {
        return this.myList;
    }

    public String take() {
        String lastValue = this.myList.get(this.myList.size() - 1);
        this.myList.remove(lastValue);
        return lastValue;
    }
}
