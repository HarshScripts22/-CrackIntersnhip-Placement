import java.util.ArrayList;
import java.util.Arrays;

public class intersection {
    public static void main(String[] args) {
        int[] nums1 = { 4, 9, 5 };
        int[] nums2 = { 9, 4, 9, 8, 4 };
        System.out.println((intersect(nums1, nums2)));

    }

    public static ArrayList<Integer> intersect(int[] nums1, int[] nums2) {
        // ArrayList<Integer> ans = new ArrayList<>();
        // int[] visited = new int[nums2.length];
        // for (int k = 0; k < nums2.length; k++) {
        // visited[k] = 0;
        // }
        // for (int i = 0; i < nums1.length; i++) {
        // for (int j = 0; j < nums2.length; j++) {
        // if (nums1[i] == nums2[j] && visited[j] == 0) {
        // ans.add(nums1[i]);
        // visited[j] = 1;
        // break;

        // }
        // if (nums2[j] > nums1[i]) {
        // break;

        // }
        // }
        // }
        // int[] arr = new int[ans.size()];
        // for (int i = 0; i < ans.size(); i++) {
        // arr[i] = ans.get(i);

        // }
        // return arr;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;

            } else if (nums1[i] > nums2[j]) {
                j++;

            } else {
                list.add(nums1[i]);
                i++;
                j++;
            }

        }
        return list;

    }
}
