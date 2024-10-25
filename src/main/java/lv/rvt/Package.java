package lv.rvt;
import java.util.*;

public class Package {
    private ArrayList<Gift> gifts;

    public Package() {
        this.gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        this.gifts.add(gift);
    }

    public double totalWeitght() {
        double totalWeitght = 0;
        for (Gift gift: this.gifts) {
            totalWeitght += gift.getWeight();
        }
        return totalWeitght;
    }
}