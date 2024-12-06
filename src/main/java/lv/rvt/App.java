package lv.rvt;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Statistics stats = new Statistics();
        stats.receivePoints();
        System.out.println("Point average (all): " + stats.averagePoint());
        stats.passingGrade();
        stats.passPercentage();
        stats.gradeDistribution();
    }
}
