package lv.rvt;

import java.util.*;

public class Statistics {
    private ArrayList<Integer> list;
    private Scanner scanner;

    public Statistics() {
        this.list = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void receivePoints() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            } else if (number >= 0 && number <= 100) {
                list.add(number);
            }
        }
    }

    public Double averagePoint() {
        if (list.isEmpty()) {
            return 0.0;
        }

        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum / list.size();
    }

    public void passingGrade() {
        double sum = 0;
        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= 50) {
                sum += list.get(i);
                count++;
            }
        }
            
        if (count == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + sum/count);
        }
    }

    public void passPercentage() {
        if (list.isEmpty()) {
            System.out.println("Pass percentage: 0.0");
            return;
        }

        int count = 0;
        for (int point: list) {
            if (point >= 50) {
                count++;
            }
        }

        double percentage = (double) count / list.size() * 100;
        System.out.println("Pass percentage: " + percentage);
    }

    public void gradeDistribution() {
        int[] grades = new int[6];
        
        for (int point : list) {
            if (point >= 90) {
                grades[5]++;
            } else if (point >= 80) {
                grades[4]++;
            } else if (point >= 70) {
                grades[3]++;
            } else if (point >= 60) {
                grades[2]++;
            } else if (point >= 50) {
                grades[1]++;
            } else {
                grades[0]++;
            }
        }
    
        System.out.println("Grade distribution:");
        for (int i = grades.length - 1; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < grades[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
