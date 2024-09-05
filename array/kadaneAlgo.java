public class kadaneAlgo {
    public static void main(String[] args) {
        int[] arr = { 2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int n = arr.length;
        System.out.println(findmaxsubARRsum(n, arr));

    }

    public static int findmaxsubARRsum(int n, int arr[]) {

        // brute force approach-
        // int maxi = Integer.MIN_VALUE;

        // for (int i = 0; i < n; i++) {
        // int sum = 0;// har baar sum 0 liya jayega kyuki new subarr rahegi
        // for (int j = i; j < n; j++) {
        // sum += arr[j];
        // maxi = Math.max(maxi, sum);
        // }

        // }
        // if (maxi < 0) {
        // maxi = 0;

        // }
        // return maxi;
        // -----------------------------------------------------------------------------------

        // optimal sol
        // using kadane algo
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum > maxi) {
                maxi = sum;
            }
            if (sum < 0) {
                sum = 0;
            }

        }
        return maxi;

    }
}
