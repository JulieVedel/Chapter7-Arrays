package com.company;

import java.util.Arrays;
import java.util.Random;

public class Exercise3 {
    public static void main(String[] args) {
        int[] array = randomArray(10);
        System.out.println(Arrays.toString(array));
        System.out.print("Max value is at index " + indexOfMax(array));
        System.out.println(" or at position " + (indexOfMax(array) + 1));
    }

    public static int indexOfMax(int[] a) {
        int maxValue = Arrays.stream(a).max().getAsInt();
        int maxIndex = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] == maxValue) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
//      Freddie wrote this. He wasn't nor was right.
//    public static int indexOfMax(int[] a) {
//        int maxValue = Arrays.stream(a).max().getAsInt();
//        int indexTracker = 0;
//        for (int arrayNumber : a) {
//            if (arrayNumber == maxValue)
//                break;
//            indexTracker++;
//        }
//        return indexTracker;
//    }

    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }
}
