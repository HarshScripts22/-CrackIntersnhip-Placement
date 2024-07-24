import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class threeSum {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        System.out.println(findthreeSum(nums));

    }

    public static ArrayList<ArrayList<Integer>> findthreeSum(int nums[]) {
        int n = nums.length;

        HashSet<ArrayList<Integer>> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        ArrayList<Integer> temp = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                        temp.sort(null);
                        set.add(temp);

                    }

                }
            }
        }
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(set);
        return list;

    }
}
