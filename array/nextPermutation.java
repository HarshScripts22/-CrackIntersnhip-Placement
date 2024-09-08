import java.lang.reflect.Array;
import java.util.Arrays;

public class nextPermutation {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3 };
        Permutation(nums);
        System.out.println(Arrays.toString(nums));
    }
    // brute force approach -
    // first we find all sorted combination then linear search over it to find input
    // & then we find it we take next ind as ans...
    // t(c) here is O(n!*n)

    // optimal approach-

    public static void Permutation(int nums[]) {
        int n = nums.length;
        if (nums == null || nums.length <= 1) {
            return;

        }
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i])
                j--;
            swap(nums, i, j);
        }
        reverse(nums, i + 1, n - 1);
    }

    public static void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int nums[], int i, int j) {
        while (i < j)
            swap(nums, i++, j--);
    }
}
