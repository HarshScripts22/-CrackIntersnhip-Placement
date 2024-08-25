import java.util.ArrayList;

public class pascalTrinangle {
    public static void main(String[] args) {
        int n = 5;
        findPascaltrinangle(n);

    }

    public static void findPascaltrinangle(int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int row = 1; row <= n; row++) {
            ArrayList<Integer> tempList = new ArrayList<>();
            for (int col = 1; col <= row; col++) {
                tempList.add(ncrFunc(row - 1, col - 1));
            }
            ans.add(tempList);
        }
        System.out.print(ans + " ");
        System.out.println();
    }

    public static int ncrFunc(int n, int r) {
        int res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;

    }
}
