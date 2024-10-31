package lv.rvt;

public class Item {
    public static final Item getWeight = null;
    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("%s(%s kg)", name, weight);
    }
}