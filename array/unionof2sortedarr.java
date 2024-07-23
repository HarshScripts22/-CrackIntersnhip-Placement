import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class unionof2sortedarr {
    public static void main(String[] args) {
        int[] arr1 = {};
        int[] arr2 = { 1, 1, 2, 3, 4 };
        int n = arr1.length;
        int m = arr2.length;
        System.out.println(Union(arr1, arr2, n, m));
    }

    public static ArrayList<Integer> Union(int arr1[], int arr2[], int n, int m) {
        // BRUTE FORCE APPROACH T(C) O(m+nlog(m+n));
        // S(c) O(m+n)

        // HashSet<Integer> set = new HashSet<>();
        // for (int i = 0; i < n; i++) {
        // set.add(arr1[i]);
        // }
        // for (int i = 0; i < m; i++) {
        // set.add(arr2[i]);
        // }
        // // return set;
        // ArrayList<Integer> list = new ArrayList<>(set);
        // Collections.sort(list);
        // return list;
        // using 2 pointer approach..
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (!list.contains(arr1[i])) {
                    list.add(arr1[i]);

                }
                i++;
            }

            else {
                if (!list.contains(arr2[j])) {
                    list.add(arr2[j]);
                }
                j++;
            }
        }
        while (j < m) {
            if (!list.contains(arr2[j])) {
                list.add(arr2[j]);

            }
            j++;

        }
        while (i < n) {
            if (!list.contains(arr1[i])) {
                list.add(arr1[i]);

            }
            i++;

        }
        return list;
    }
}
