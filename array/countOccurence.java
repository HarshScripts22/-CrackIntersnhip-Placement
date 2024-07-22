public class countOccurence {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3 };
        int x = 4;
        int n = arr.length;
        System.out.println(countNum(arr, x, n));
    }

    public static int countNum(int arr[], int x, int n) {
        // brute force approach T(c) = O(n)
        // int count = 0;
        // for (int i = 0; i < n; i++) {
        // if (arr[i] == x) {
        // count++;

        // }
        // }
        // return count;
        // now binary search T(c)= O(logn)
        int first = binarysearch(arr, n, x, true);
        int last = binarysearch(arr, n, x, false);
        if (first == -1) {
            first = 0;

        }
        int count = last - first + 1;
        return count;

    }

    public static int binarysearch(int arr[], int n, int x, Boolean ocur) {
        int s = 0;
        int e = n - 1;
        int ans = -1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == x) {

                if (ocur) {
                    ans = mid;
                    e = mid - 1;

                } else {
                    ans = mid;
                    s = mid + 1;
                }

            } else if (arr[mid] < x) {
                s = mid + 1;

            } else {
                e = mid - 1;
            }

        }
        return ans;
    }
}