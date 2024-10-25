package lv.rvt;

public class Gift {
    private String name;
    private double weight;

    public Gift(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public double getWeight() {
        return this.weight;
    }

    public String toString() {
        return String.format("%s (%s kg)", this.name, this.weight);
    }
}
