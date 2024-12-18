package Sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selection(int arr[]) {
        int n = arr.length;

        // 1) in selection sort we hypothectically assume that arr is divided into
        // sorted and unsorted part but initally it is fully unsorted..
        // 2) we have to select minimum element and swap it to starting index to make
        // sorted arr.
        // 3) N-1 iteration == N-1 smallest..

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {

                    min = j;

                }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }

    }
}
