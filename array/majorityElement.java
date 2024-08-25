import java.util.*;

import javax.swing.text.html.parser.Element;

public class majorityElement {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(findMajority(arr));

    }

    public static int findMajority(int arr[]) {
        // int n = arr.length;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < n; i++) {
        // if (!map.containsKey(arr[i])) {
        // map.put(arr[i], 1);
        // } else {
        // map.put(arr[i], map.get(arr[i]) + 1);
        // }
        // }
        // for (Map.Entry<Integer, Integer> e : map.entrySet()) {
        // if (e.getValue() > n / 2) {
        // return e.getKey();
        // }
        // }
        // System.out.println(map);
        // return -1;

        int n = arr.length;
        int count = 0;
        int element = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count++;
                element = arr[i];

            } else if (element == arr[i]) {
                count++;

            } else {
                count--;
            }
        }
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == element) {
                cnt1++;
            }
        }
        if (cnt1 > (n / 2))
            return element;
        return -1;

    }
}
