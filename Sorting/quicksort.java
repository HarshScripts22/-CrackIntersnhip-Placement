package Sorting;

import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
        int arr[] = { 4, 6, 2, 5, 7, 9, 1, 3 };
        int low = 0;
        int high = arr.length - 1;
        qsort(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }

    public static void qsort(int arr[], int low, int high) {
        int n = arr.length;

        // first select the pivot ele which is chosen ele in the given arr.
        // then place it to it right place in sorted arrr
        // and then when u iterate through arr u need to place ele which is smaller than
        // pivot to left side and ele which is greater than pivot to right side
        // in this we call recursive func to sort arr
        // partition index will decide from where is the division of left and right
        // subarray
        if (low < high) {
            int partIdx = partition(arr, low, high);
            qsort(arr, low, partIdx - 1);
            qsort(arr, partIdx + 1, high);
        }

    }

    public static int partition(int arr[], int low, int high) {

        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {

            while (arr[i] <= pivot && i < high) {
                i++;

            }
            while (arr[j] > pivot && j > low) {
                j--;

            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }

        }

        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;

        return j;
    }
}
