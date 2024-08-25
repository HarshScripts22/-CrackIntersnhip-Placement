import java.util.Arrays;

public class mergedsortedarr {
    public static void main(String[] args) {
        int[] nums1 = { 0, 3, 5, 7 };
        int[] nums2 = { 1, 2, 6, 8, 9 };
        int m = nums1.length;
        int n = nums2.length;
        mergeArr(nums1, nums2, m, n);
    }

    public static void mergeArr(int nums1[], int nums2[], int m, int n) {
        int i = 0;
        int j = 0;
        int[] arr3 = new int[m + n];
        int k = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                arr3[k] = nums1[i];
                i++;
                k++;

            } else {
                arr3[k] = nums2[j];
                j++;
                k++;
            }

        }
        while (j < n) {
            arr3[k] = nums2[j];
            j++;
            k++;

        }
        while (i < m) {
            arr3[k] = nums1[i];
            i++;
            k++;
        }
        // 012356789
        for (int x = 0; x < m + n; x++) {
            if (x < m) {
                nums1[x] = arr3[x];

            } else {
                nums2[x - m] = arr3[x];
            }

        }
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

    }
}