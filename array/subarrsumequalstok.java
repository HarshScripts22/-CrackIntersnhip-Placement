import java.util.HashMap;

public class subarrsumequalstok {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1 };
        int k = 2;
        System.out.println(countsubarr(nums, k));
    }

    public static int countsubarr(int nums[], int k) {
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
