package com.company;

import java.util.Arrays;

public class Main {
    public static int randomNumber(int min, int max) {
        return (min + (int) (Math.random() * (max - min)));
    }

    public static int[] risingGeneration(int min, int max, int size){
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] =  randomNumber(min, max);
            min = randomNumber(min, max);
            array[i] = min;

        }
        return array;
    }
    public static void main(String[] args) {
        int[] end = {};
        end=risingGeneration(0,50,10);
        System.out.println(Arrays.toString(end));
    }
}
