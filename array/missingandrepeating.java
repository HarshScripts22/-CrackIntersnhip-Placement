import java.util.Arrays;
import java.util.HashMap;

public class missingandrepeating {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 3 };
        int n = arr.length;
        System.out.println(Arrays.toString(findmissandrepeat(arr, n)));
    }

    public static int[] findmissandrepeat(int arr[], int n) {
        // int ans[] = new int[2];
        // brute force approach---------------------
        // for (int i = 1; i < n + 1; i++) {
        // int cnt = 0;
        // for (int j = 0; j < n; j++) {
        // if (arr[j] == i) {
        // cnt++;

        // }
        // }
        // if (cnt == 2) {
        // ans[0] = i;
        // } else if (cnt == 0) {
        // ans[1] = i;
        // }
        // }
        // return ans;
        // time complexity - O(n^2)
        // space complexity - O(1)

        // better appraoch by hashmap --------------------
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int num : arr) {
        // if (map.containsKey(num)) {
        // map.put(num, map.get(num) + 1);

        // } else {
        // map.put(num, 1);
        // }
        // }
        // for (int i = 1; i < n + 1; i++) {
        // if (map.containsKey(i)) {
        // if (map.get(i) > 1) {
        // ans[0] = i;

        // }

        // } else {
        // ans[1] = i;
        // }
        // }
        // return ans;
        // time complexity - O(n)
        // space complexity - O(n)

        // optimal approach usinng math operation--------------

        // Find Sn and S2n:
        long SN = (n * (n + 1)) / 2;
        long S2N = (n * (n + 1) * (2 * n + 1)) / 6;

        // Calculate S and S2:
        long S = 0, S2 = 0;
        for (int i = 0; i < n; i++) {
            S += arr[i];
            S2 += (long) arr[i] * (long) arr[i];
        }

        // S-Sn = X-Y:
        long val1 = S - SN;

        // S2-S2n = X^2-Y^2:
        long val2 = S2 - S2N;

        // Find X+Y = (X^2-Y^2)/(X-Y):
        val2 = val2 / val1;

        // Find X and Y: X = ((X+Y)+(X-Y))/2 and Y = X-(X-Y),
        // Here, X-Y = val1 and X+Y = val2:
        long x = (val1 + val2) / 2;
        long y = x - val1;

        int[] ans = { (int) x, (int) y };
        return ans;
    }
}
