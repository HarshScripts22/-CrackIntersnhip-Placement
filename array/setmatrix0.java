import java.util.Arrays;

public class setmatrix0 {
    public static void main(String[] args) {
        int[][] a = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        int n = a.length;
        int m = a[0].length;
        // System.out.println(Arrays.deepToString(changeMatrix((a), n, m)));
        changeMatrix(a, n, m);
    }
    // brute force approach
    // ---------------------------------------------------------------------------------------------------------------------
    // public static int[][] changeMatrix(int[][] a, int n, int m) {
    // int[] row = new int[n];
    // int[] col = new int[m];
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // if (a[i][j] == 0) {
    // row[i] = 1;
    // col[j] = 1;
    // }
    // }
    // }
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // if (row[i] == 1 || col[j] == 1) {
    // a[i][j] = 0;

    // }

    // }
    // }
    // return a;
    // }

    // ----optimal appraoch
    public static void changeMatrix(int a[][], int n, int m) {
        int col0 = 1;
        for (int i = 0; i < n; i++) {
            if (a[i][0] == 0) {
                col0 = 0;
            }
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 0) {
                    a[i][0] = a[0][j] = 0;
                }
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 1; j--) {
                if (a[i][0] == 0 || a[0][j] == 0) {
                    a[i][j] = 0;

                }
            }
            if (col0 == 0) {
                a[i][0] = 0;

            }
        }
        System.out.println(Arrays.deepToString(a));
    }
}
