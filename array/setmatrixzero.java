public class setmatrixzero {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(removeDuplicates(arr));
        // 01234

    }

    public static int removeDuplicates(int arr[]) {
        int n = arr.length;
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];

            }
        }
        return j + 1;
    }
}
