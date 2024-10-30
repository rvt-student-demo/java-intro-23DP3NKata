package lv.rvt;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Random random = new Random();
        int[] randomValues = new int[10];
        
        for (int i = 0; i < 10; i++) {
            randomValues[i] = random.nextInt(10) + 1;
        }

        int minNumber = randomValues[0];
        int maxNumber = randomValues[0];
        int sum = 0;

        for (int i = 0; i < randomValues.length; i++) {
            if (randomValues[i] < minNumber) {
                minNumber = randomValues[i];
            }

            if (randomValues[i] > maxNumber) {
                maxNumber = randomValues[i];
            }
            
            System.out.print(randomValues[i] + ", ");
            sum += randomValues[i];
        }
        
        System.out.println();
        System.out.println("Minimum number: " + minNumber);
        System.out.println("Maximum number: " + maxNumber);
        System.out.println("Average: " + (sum / 10.0));
    }
}
