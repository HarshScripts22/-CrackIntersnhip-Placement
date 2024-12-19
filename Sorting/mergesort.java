// package Sorting;

import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int arr[] = { 4, 6, 2, 5, 7, 9, 1, 3 };
        int low = 0;
        int high = arr.length - 1;

        mergeSort(arr, low, high);
        System.out.println(Arrays.toString(arr));

    }

    private static void merge(int arr[], int low, int mid, int high) {

        int temp[] = new int[high - low + 1];

        int left = low;
        int right = mid + 1;
        int i = 0;

        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                temp[i] = arr[left];
                left++;
                i++;

            } else {
                temp[i] = arr[right];
                right++;
                i++;
            }

        }
        while (left <= mid) {
            temp[i] = arr[left];
            left++;
            i++;

        }
        while (right <= high) {
            temp[i] = arr[right];
            right++;
            i++;

        }

        for (int j = 0; j < temp.length; j++) {
            arr[j + low] = temp[j];
        }

    }

    public static void mergeSort(int arr[], int low, int high) {
        if (low >= high) {
            return;

        }
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

}
