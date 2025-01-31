import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter val of n here");
        // int n = scn.nextInt();
        int n = 5;
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

        // for (int i = 1; i <= n; i++) {
        // System.out.printf("%" + n + "s%n", "*".repeat(i));
        // }
        // -----------------------------------------------------------------------------------------
        // ques 2-
        // triangle shaped -

        // int stars = 1;
        // int str = 1;
        // for (int row = 1; row <= n; row++) {
        // int spaces = n - row;
        // for (int i = 1; i <= spaces; i++) {
        // System.out.print(" ");
        // }
        // spaces--;
        // for (int j = 1; j <= stars; j++) {
        // System.out.print("*");
        // }
        // stars++;

        // if (row > 1) {

        // for (int i = 1; i <= str; i++) {
        // System.out.print("*");
        // }
        // str++;
        // // System.out.println();

        // }

        // System.out.println();

        // }

        // ques 3-
        // downside triangle shaped -

        int spaces = 0;
        for (int row = n; row > 0; row--) {
            for (int i = 1; i <= spaces; i++) {
                System.out.print(" ");

            }
            spaces++;
            for (int j = 1; j <= row * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
