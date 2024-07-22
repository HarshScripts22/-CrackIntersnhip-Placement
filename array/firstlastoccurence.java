import java.util.ArrayList;

public class firstlastoccurence {

    public static void main(String[] args) {
        // int[] arr = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        int[] arr = { 1, 3, 5, 5, 5, 5, 7, 123, 125 };
        int x = 5;
        int n = arr.length;
        System.out.println(findFirstLast(arr, x, n));

    }

    static ArrayList<Integer> findFirstLast(int arr[], int x, int n) {
        // brute force approach t(c) is O(n)
        // ArrayList<Integer> list = new ArrayList<>();
        // int first = -1;
        // int last = -1;
        // for (int i = 0; i < n; i++) {
        // if (arr[i] == x) {
        // if (first != -1) {
        // last = i;

        // } else {
        // first = i;
        // last = i;
        // }

        // }

        // }
        // list.add(first);
        // list.add(last);
        // return list;

        // using binary search for first occurence and last occurence..

        ArrayList<Integer> list = new ArrayList<>();
        int first = binarysearch(arr, x, n, true);
        int last = binarysearch(arr, x, n, false);
        list.add(first);
        list.add(last);
        return list;

    }

    public static Integer binarysearch(int arr[], int x, int n, Boolean occur) {

        int res = -1;
        int s = 0;
        int e = n - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == x) {
                if (occur) {
                    res = mid;
                    e = mid - 1;

                } else {
                    res = mid;
                    s = mid + 1;
                }
            } else if (arr[mid] < x) {
                s = mid + 1;

            } else {
                e = mid - 1;
            }

        }
        return res;

    }
}
