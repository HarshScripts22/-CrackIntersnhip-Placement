// package searching;

public class binarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 6;
        int ans = bs(arr, target);
        System.out.println(ans);
    }

    public static int bs(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = high - (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid - 1;

            } else {
                low = mid + 1;
            }
            System.out.println(mid);
        }
        return -1;
    }
}
