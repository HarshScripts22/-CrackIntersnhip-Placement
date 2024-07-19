import java.util.Arrays;

public class findduplicatenumber {
    public static void main(String[] args) {
        int[] arr = { 3, 3, 3, 3, 3 };
        System.out.println(findDuplicateNo(arr));

    }

    public static int findDuplicateNo(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int curr = arr[i];
            if (arr[i] != arr[curr]) {
                int temp = arr[i];
                arr[i] = arr[curr];
                arr[curr] = temp;

            } else {
                i++;

            }

        }
        System.out.println(Arrays.toString(arr));
        for (int ind = 0; ind < arr.length; ind++) {
            if (arr[ind] != ind) {
                return arr[ind];

            }

        }
        return -1;
    }
}
