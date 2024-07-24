import java.util.HashMap;

public class subarrsumdivisiblebyK {
    public static void main(String[] args) {
        // int[] nums = { 4, 5, 0, -2, -3, 1 };
        int[] nums = { 2, -6, 3, 1, 2, 8, 2, 1 };
        // -2-30145
        int k = 7;
        System.out.println(subarrbyK(nums, k));

    }

    public static int subarrbyK(int nums[], int k) {
        // int n = nums.length;
        // int count = 0;
        // int sum = 0;
        // for (int i = 0; i < n; i++) {
        // sum += nums[i];
        // System.out.println(sum % k);
        // if (nums[i] % k == 0) {
        // count++;

        // }
        // for (int j = i + 1; j < n; j++) {

        // sum += nums[j];
        // if (sum % k == 0) {
        // count++;

        // }

        // }
        // sum = 0;
        // }
        // return count;
        // time limit exceed in this sol
        // optimal sol will be there soon.
        // using hashmap approach
        int ans = 0;
        int sum = 0;
        int rem = 0;
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < n; i++) {
            sum += nums[i];

            rem = sum % k;
            if (rem < 0) {
                rem += k;

            }
            if (map.containsKey(rem)) {
                map.put(rem, map.get(rem) + 1);
                ans++;

            } else {
                map.put(rem, 1);
            }

        }
        return ans;

    }

}
