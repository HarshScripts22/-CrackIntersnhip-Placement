public class subarrsumdivisiblebyK {
    public static void main(String[] args) {
        // int[] nums = { 4, 5, 0, -2, -3, 1 };
        int[] nums = { -5 };
        // -2-30145
        int k = 5;
        System.out.println(subarrbyK(nums, k));

    }

    public static int subarrbyK(int nums[], int k) {
        int n = nums.length;
        int count = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            System.out.println(sum % k);
            if (nums[i] % k == 0) {
                count++;

            }
            for (int j = i + 1; j < n; j++) {

                sum += nums[j];
                if (sum % k == 0) {
                    count++;

                }

            }
            sum = 0;
        }
        return count;
    }
    // time limit exceed in this sol
    // optimal sol will be there soon.

}
