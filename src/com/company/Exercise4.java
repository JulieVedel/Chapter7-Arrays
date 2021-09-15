package com.company;

import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {
        sieve(30);
    }

    public static void sieve(int n) {
        int[] numbers = new int [n];
        int p = 2;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;

            if (numbers[i] % p != 0) {
                int[] array = 
            }
        }

        System.out.println(Arrays.toString(numbers));
    }
}
