import java.util.ArrayList;

public class duplicateelements {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(findDuplicate(arr));

    }

    public static ArrayList<Integer> findDuplicate(int arr[]) {
        ArrayList<Integer> list1 = new ArrayList<>();

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) - 1;
            if (arr[index] < 0) {
                list1.add(Math.abs(arr[i]));

            }
            arr[index] = -arr[index];
        }
        return list1;

    }

}
