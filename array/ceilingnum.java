public class ceilingnum {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 7, 9, 19 };
        int n = arr.length;
        int ceil = 5;
        System.out.println(findCeilingNum(arr, n, ceil));
    }

    public static int findCeilingNum(int arr[], int n, int ceil) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == ceil) {
                return arr[i];
            }
            if (arr[i] > ceil) {
                return arr[i];

            }
        }
        return -1;
    }
}
