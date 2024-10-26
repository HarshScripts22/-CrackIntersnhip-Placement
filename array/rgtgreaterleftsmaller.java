public class rgtgreaterleftsmaller {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 1, 3, 5, 7, 6, 8 };
        int n = arr.length;
        System.out.println(findElement(arr, n));

    }

    public static int findElement(int[] arr, int n) {
        // brute-force approach--
        // for (int i = 1; i < arr.length; i++) {
        // int j = i - 1;
        // int k = i + 1;
        // while (j >= 0 && k < n) {
        // if (arr[j] < arr[i] && arr[i] < arr[k]) {
        // return arr[i];

        // }
        // j--;
        // k++;

        // }

        // }
        // return -1;

        if (n < 3)
            return -1; // Not enough elements to have a valid element in the middle

        int[] leftMax = new int[n];
        int[] rightMin = new int[n];

        // Initialize the leftMax array
        leftMax[0] = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i - 1]);
        }

        // Initialize the rightMin array
        rightMin[n - 1] = Integer.MAX_VALUE;
        for (int i = n - 2; i >= 0; i--) {
            rightMin[i] = Math.min(rightMin[i + 1], arr[i + 1]);
        }

        // Find the element that satisfies the condition
        for (int i = 1; i < n - 1; i++) {
            if (leftMax[i] < arr[i] && arr[i] < rightMin[i]) {
                return arr[i]; // Return the element that satisfies the condition
            }
        }

        return -1;
    }

}
