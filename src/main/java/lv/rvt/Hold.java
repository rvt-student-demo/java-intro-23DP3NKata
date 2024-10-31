package lv.rvt;
import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeightSuitcases;

    public Hold(int maxWeightSuitcases) {
        this.suitcases = new ArrayList<>();
        this.maxWeightSuitcases = maxWeightSuitcases;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= maxWeightSuitcases) {
            suitcases.add(suitcase);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase : suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }

    public void printItems() {
        for (Suitcase suitcase: suitcases) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        int suitcasesCount = suitcases.size();
        return String.format("%s suitcases (%s kg)", suitcasesCount, totalWeight());
    }
}
