import java.util.HashMap;

public class longestsubarrwithsumk {
    public static void main(String[] args) {
        // int[] a = { 2, 3, 5, 1, 9 };
        int[] a = { 1, 2, 3, 1, 1, 1, 1, 3, 3 };
        int k = 6;
        System.out.println(longestSubarr(a, k));

    }

    public static int longestSubarr(int a[], int k) {
        // HashMap<Long, Integer> map = new HashMap<>();
        // int n = a.length;
        // long sum = 0;
        // int Maxlen = 0;
        // for (int i = 0; i < n; i++) {
        // sum += a[i];
        // if (sum == k) {
        // Maxlen = Math.max(Maxlen, i + 1);

        // }
        // long rem = sum - k;
        // if (map.containsKey(rem)) {
        // int len = i - map.get(rem);
        // Maxlen = Math.max(Maxlen, len);

        // }
        // System.out.println(map);
        // if (!map.containsKey(sum)) {
        // map.put(sum, i);

        // }
        // }
        // return Maxlen;
        // 23519
        // 123111133
        int left = 0;
        int right = 0;
        int n = a.length;
        long sum = a[0];
        int len = 0;
        while (right < n) {
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;

            }
            if (sum == k) {
                len = Math.max(right - left + 1, len);

            }
            right++;
            if (right < n) {
                sum += a[right];

            }

        }
        return len;

    }
}
