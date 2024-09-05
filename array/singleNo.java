import java.util.*;

public class singleNo {
    public static void main(String[] args) {
        int[] nums = { 4 };
        int n = nums.length;
        System.out.println(singleNumber(nums, n));

    }

    public static int singleNumber(int nums[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);

            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }

        }
        System.out.println(map);
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) {
                return e.getKey();
            }

        }
        return nums[0];

    }
}
