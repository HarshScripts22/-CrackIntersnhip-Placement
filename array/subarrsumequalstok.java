import java.util.HashMap;

public class subarrsumequalstok {
    public static void main(String[] args) {
        int[] nums = { 10, 5, 2, 7, 1, 9 };
        // a = {10, 5, 2, 7, 1, 9}, k = 15
        int k = 15;
        System.out.println(countsubarr(nums, k));
    }

    public static int countsubarr(int nums[], int k) {
        // brute force approach -

        // int len = 0;
        // for (int i = 0; i < nums.length; i++) {
        // int sum = 0;
        // for (int j = i; j < nums.length; j++) {
        // sum += nums[i];
        // if (sum == k) {
        // len = Math.max(len, j - i + 1);

        // }

        // }
        // }
        // return len;

        // better approach-
        int n = nums.length;
        int count = 0;
        int sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < n; i++) {
            sum += nums[i];

            int remove = sum - k;
            count += map.getOrDefault(remove, 0);
            map.put(sum, map.getOrDefault(remove, 0) + 1);

        }

        return count;
    }
}
