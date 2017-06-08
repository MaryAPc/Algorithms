package com.maryapc.algorithms.sortings;

public class QuickSort {

    //O(n lg n) or O(n^2)
    public static int[] sort(int[] array) {
        return sortArray(array, 0, array.length - 1);
    }

    private static int[] sortArray(int[] array, int l, int r) {
        if (l >= r) {
            return array;
        } else {
            int q = partition(array, l, r);
            sortArray(array, l, q - 1);
            sortArray(array, q + 1, r);
        }
        return array;
    }

    private static int partition(int[] array, int l, int r) {
        int q = l;
        int temp;
        for (int i = l; i < r; i++) {
            if (array[i] <= array[r]) {
                temp = array[q];
                array[q] = array[i];
                array[i] = temp;
                q++;
            }
        }
        temp = array[q];
        array[q] = array[r];
        array[r] = temp;
        return q;
    }
}
