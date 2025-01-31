package patterns;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a val of n");
        int n = scn.nextInt();

        scn.close();

        // ques 1-
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *

        // for (int rows = 1; rows <= n; rows++) {

        // for (int cols = 1; cols <= rows; cols++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // ques 2-
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *

        // for (int rows = 1; rows <= n; rows++) {
        // for (int cols = 1; cols <= n; cols++) {
        // System.out.print("* ");
        // }
        // System.out.println();

        // }

        // ques 3-
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *

        // for (int rows = 1; rows <= n; rows++) {
        // for (int cols = 1; cols <= n + 1 - rows; cols++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // ques 4-
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5

        // for (int rows = 1; rows <= n; rows++) {

        // for (int cols = 1; cols <= rows; cols++) {
        // System.out.print(cols + " ");
        // }
        // System.out.println();
        // }

        // ques 5-

        // *
        // **
        // ***
        // ****
        // *****
        // ****
        // ***
        // **
        // *

        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int rows = 1; rows <= n - 1; rows++) {
            for (int cols = 1; cols <= n - rows; cols++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

}
