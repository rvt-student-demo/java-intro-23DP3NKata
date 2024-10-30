package lv.rvt;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> randomValue = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            randomValue.add(random.nextInt(10) + 1);
        }

        int minNumber = randomValue.get(0);
        int maxNumber = randomValue.get(0);
        int average = 0;
        for (int i = 0; i < randomValue.size(); i++) {
            if (randomValue.get(i) < minNumber) {
                minNumber = randomValue.get(i);
            }

            if (randomValue.get(i) > maxNumber) {
                maxNumber = randomValue.get(i);
            }
            System.out.print(randomValue.get(i) + ", ");
            average += randomValue.get(i);
        }
        
        System.out.println();
        System.out.println(minNumber + " " + maxNumber);
        System.out.println(Double.valueOf(average/10.0));

    }
}