import java.util.Arrays;

public class chocolateproblem {
    public static void main(String[] args) {

        int[] arr = { 3, 4, 1, 9, 56, 7, 9, 12 };
        // int[] arr = { 7, 3, 2, 4, 9, 12, 56 };
        int m = 5;
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(minDiff(n, m, arr));

    }

    public static long minDiff(int n, int m, int arr[]) {
        Arrays.sort(arr);
        int i = 0;
        int j = m - 1;
        int mini = Integer.MAX_VALUE;
        while (j < n) {
            int dif = arr[j] - arr[i];
            mini = Math.min(mini, dif);
            i++;
            j++;

        }

        return (long) mini;

    }
}
