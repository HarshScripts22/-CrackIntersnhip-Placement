import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        int target = 6;
        int[] nums = { 3, 2, 4 };
        System.out.println(Arrays.toString(findSumIndex(target, nums)));

    }

    public static int[] findSumIndex(int target, int nums[]) {

        // HashMap<Integer, Integer> seen = new HashMap<>();
        // for (int i = 0; i < arr.length; i++) {
        // seen.put(arr[i], i);
        // }

        // for (int i = 0; i < arr.length; i++) {
        // int diff = target - arr[i];

        // if (seen.containsKey(diff)) {
        // if (!seen.containsValue(i)) {
        // return new int[] { arr[i], diff };
        // }

        // }
        // }
        // return new int[] { -1, -1 };

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };

    }
}
