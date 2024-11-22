package lv.rvt;

import java.util.Arrays;

public class MainProgram {

    public static int smallest(int[] array) {
        int smallestNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallestNumber > array[i]) {
                smallestNumber = array[i];
            }
        } return smallestNumber;
    }

    public static int indexSmallet(int[] array) {
        int indexSmallestNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[indexSmallestNumber] > array[i]) {
                indexSmallestNumber = i;
            }
        } return indexSmallestNumber;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int indexSmallestNumber = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (array[indexSmallestNumber] > array[i]) {
                indexSmallestNumber = i;
            }
        } return indexSmallestNumber;
    }

    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            
            int indexSmallest = indexOfSmallestFrom(array, i);

            swap(array, i, indexSmallest);
        }
    }
}
