public class buynsellstock {
    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        System.out.println(MaxProfit(arr));

    }

    public static int MaxProfit(int arr[]) {
        int buy = arr[0];
        int n = arr.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            buy = Math.min(buy, arr[i]);
        }

        int[] aux = new int[n];
        aux[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            aux[i] = Math.max(aux[i + 1], arr[i]);

        }

        for (int i = 0; i < n; i++) {
            max = Math.max(max, aux[i] - arr[i]);
        }
        return max;

    }
}
