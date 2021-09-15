package com.company;

public class Exercise5 {
    public static void main(String[] args){
        int[] array = {3, 6, 9, 12, 30};
        System.out.println(areFactors(3, array));
    }

    public static boolean areFactors(int n, int[] array) {
        boolean factor = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % n != 0) {
                factor = false;
            }
        }
        return factor;
    }
}
