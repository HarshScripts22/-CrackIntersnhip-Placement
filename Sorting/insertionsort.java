package Sorting;

import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int arr[] = { 1, 22, 3, 45, 65 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int arr[]) {

        int n = arr.length;
        // intially we let first ele as sorted
        // curr = arr[i] and prev = i-1
        // we will check in sorted arrr that curr ele is at sort pos or not if not then
        // we will swap to lft side and move pre to right side

        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;

            }

        }
    }
}
