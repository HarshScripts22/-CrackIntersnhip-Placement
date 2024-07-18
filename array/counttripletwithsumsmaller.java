import java.util.Arrays;

public class counttripletwithsumsmaller {
    public static void main(String[] args) {
        // int[] arr = { 5, 1, 3, 4, 7 };
        int[] arr = { -2, 0, 1, 3 };
        int n = arr.length;
        int x = 2;
        System.out.println(Findtripletcount(n, x, arr));

    }

    public static long Findtripletcount(int n, int x, int arr[]) {
        Arrays.sort(arr);
        // BRUTE FORCE APPROACH----
        // int count = 0;
        // for (int i = 0; i < n - 2; i++) {
        // for (int j = i + 1; j < n - 1; j++) {
        // for (int k = j + 1; k < n; k++) {
        // if (arr[i] + arr[j] + arr[k] < x) {
        // count++;
        // }
        // }
        // }
        // }
        // return (long) count;
        // Time complexity - O(n^3) & space Complexity - O(1)
        // ***************************************************************************************51347
        int count = 0;

        for (int k = 0; k < n - 2; k++) {
            int i = k + 1;
            int j = i + 1;
            while (i < j) {
                if (arr[i] + arr[j] + arr[k] < x) {
                    count += (j - i);

                }
                else{
                    j--;
                }

            }
        }
        return (long) count;
    }
}
