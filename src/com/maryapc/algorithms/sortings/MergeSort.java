package com.maryapc.algorithms.sortings;

public class MergeSort {

    //O(n lg n)
    public static int[] sort(int[] array) {
        return sortArray(array, 0, array.length-1);
    }

    private static int[] sortArray(int[] array, int l, int r) {
        if (l >= r) {
            return array;
        } else {
            int m = (l + r) / 2;
            sortArray(array, l, m);
            sortArray(array, m + 1, r);
            merge(array, l, m, r);
        }
        return array;
    }

    private static void merge(int[] array, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(array, l, L, 0, n1);
        System.arraycopy(array, m + 1, R, 0, n2);

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] < R[j]) {
                array[k] = L[i];
                i++;
                k++;
            } else {
                array[k] = R[j];
                j++;
                k++;
            }
        }
        while (i < n1) {
            array[k] = L[i];
            k++;
            i++;
        }
        while (j < n2) {
            array[k] = R[j];
            k++;
            j++;
        }
    }
}
