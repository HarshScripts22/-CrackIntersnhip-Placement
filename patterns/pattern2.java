import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter val of n here");
        int n = scn.nextInt();
        scn.close();

        // ques 1-

        // *
        // **
        // ***
        // ****
        // *****

        // for (int rows = 1; rows <= n; rows++) {
        // int spaces = n - rows;
        // for (int i = 1; i <= spaces; i++) {
        // System.out.print(" ");
        // }
        // for (int cols = 1; cols <= rows; cols++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        for (int i = 1; i <= n; i++) {
            System.out.printf("%" + n + "s%n", "*".repeat(i));
        }

    }
}
