public class secondLargest {
    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 10 };
        System.out.println(findSecLargest(arr));

    }

    public static int findSecLargest(int arr[]) {
        int larg = arr[0];
        int seclarg = -1;
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (larg < arr[i]) {
                seclarg = larg;
                larg = arr[i];

            }
            if (larg > arr[i] && arr[i] > seclarg) {
                seclarg = arr[i];

            }

        }
        return seclarg;
    }
}
