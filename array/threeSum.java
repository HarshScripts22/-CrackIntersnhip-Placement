import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class threeSum {
    public static void main(String[] args) {
        int[] nums = { 3, 0, -2, -1, 1, 2 };
        System.out.println(findthreeSum(nums));

    }

    public static ArrayList<ArrayList<Integer>> findthreeSum(int nums[]) {
        int n = nums.length;

        // HashSet<ArrayList<Integer>> set = new HashSet<>();
        // for (int i = 0; i < n; i++) {
        // for (int j = i + 1; j < n; j++) {
        // for (int k = j + 1; k < n; k++) {
        // if (nums[i] + nums[j] + nums[k] == 0) {
        // ArrayList<Integer> temp = new ArrayList<>(Arrays.asList(nums[i], nums[j],
        // nums[k]));
        // temp.sort(null);
        // set.add(temp);

        // }

        // }
        // }
        // }
        // ArrayList<ArrayList<Integer>> list = new ArrayList<>(set);
        // return list;

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        HashSet<Long> set = new HashSet<>();
        int target = 0;

        for (int i = 0; i < n; i++) {
            int left = i + 1;
            int right = n - 1;

            int ntar = target - nums[i];

            while (left < right) {
                if (nums[left] + nums[right] < ntar) {
                    left++;

                } else if (nums[left] + nums[right] > ntar) {
                    right--;

                } else {
                    long hash = getHash(nums[i], nums[left], nums[right]);
                    if (set.contains(hash) == false) {
                        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right]));
                        ans.add(list);
                        set.add(hash);

                    }

                    left++;
                    right--;

                }

            }
        }
        return ans;

    }

    public static long getHash(int x, int y, int z) {
        long hash = x;
        hash *= 100000;
        hash += y;
        hash *= 100000;
        hash += z;

        return hash;
    }
}
