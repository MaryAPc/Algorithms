package com.maryapc.algorithms.sortings;

public class SelectionSort {

    //O(n^2)
    public static int[] sort(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            int smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallest]) {
                    smallest = j;
                }
            }
            temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
