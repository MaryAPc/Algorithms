package com.maryapc.algorithms.sortings;

public class BubbleSort {

    //O(n^2)
    public static int[] sort(int[] array) {
        int temp;
        for (int i = array.length; i > 0; i--) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
