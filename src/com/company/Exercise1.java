package com.company;

public class Exercise1 {

    public static int banana(int[] a) {
        int kiwi = 1;
        int i = 0;
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
        /*
        This method will return the array as it is.
         */
    }
    public static int grapefruit(int[] a, int grape) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i;
            }
        }
        return -1;
        /*
        This method will return i if the index at the array is equal to grape.
         */
    }
    public static int pineapple(int[] a, int apple) {
        int pear = 0;
        for (int pine: a) {
            if (pine == apple) {
                pear++;
            }
        }
        return pear;
        /*
        This method will +1 to pear if the array pine is equal to apple.
         */
    }

}
