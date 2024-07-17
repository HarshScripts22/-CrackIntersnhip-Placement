public class removedupsortedarr {
    public static void main(String[] args) {
        int arr[] = { 0, 0, 0, 1, 1, 2, 2, 3, 4, 5 };
        int n = arr.length;
        System.out.println(removeDuplicates(n, arr));
    }

    public static int removeDuplicates(int n, int arr[]) {
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];

            }
        }
        return i + 1; // return length of removed elements from arr
    }
}