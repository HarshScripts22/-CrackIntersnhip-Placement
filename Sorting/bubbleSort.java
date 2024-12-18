package Sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };

        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubble(int arr[]) {
        int n = arr.length;
        // 1) In bubble sort adjacent ele are compare acc to this ele are sorted.
        // 2) N-1 iterations will be there
        // 3) at each iteration largest ele arr ke last mein sort hota jayega
        // 4) most imp step -- in each iteration no of comaparsion that take place will
        // be equals to n-i-1;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
}
