import java.util.Arrays;

public class sort0s1s2s {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 2, 0 };
        int n = arr.length;
        sort012(n, arr);

    }

    // OPTIMAL SOL---- using dnf algo
    public static void sort012(int n, int arr[]) {
        int low = 0;
        int high = n - 1;
        int mid = 0;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;

            } else if (arr[mid] == 1) {
                mid++;

            } else {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }

        }
        System.out.println(Arrays.toString(arr));

    }

}