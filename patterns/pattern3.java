import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter val for n");
        int n = scn.nextInt();

        scn.close();

        // ques 1-

        // * * * * *
        // * * * *
        // * * *
        // * *
        // *
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *

        // if (n % 2 != 0) {
        // System.out.println("please take even no ");

        // } else {

        // int spaces = 0;
        // int stars = n / 2;
        // for (int row = 1; row <= n / 2; row++) {
        // for (int i = 1; i <= spaces; i++) {
        // System.out.print(" ");
        // }
        // spaces++;
        // for (int j = 1; j <= stars; j++) {
        // System.out.print("*" + " ");

        // }
        // stars--;

        // System.out.println();
        // }
        // int sp = n / 2 - 1;
        // int str = 1;
        // for (int row = n / 2 + 1; row <= n; row++) {

        // for (int i = 1; i <= sp; i++) {
        // System.out.print(" ");
        // }
        // sp--;
        // for (int j = 1; j <= str; j++) {
        // System.out.print("*" + " ");
        // }
        // str++;

        // System.out.println();
        // }

        // }

        // ques 2-
        // hollow triangle

        // int spaces = n - 1;
        // int sp = 1;
        // for (int row = 1; row <= n - 1; row++) {
        // for (int i = 1; i <= spaces; i++) {
        // System.out.print(" ");
        // }
        // spaces--;
        // System.out.print("*");

        // if (row > 1) {
        // for (int j = 1; j <= sp; j++) {
        // System.out.print(" ");
        // }
        // sp = sp + 2;
        // System.out.print("*");

        // }
        // System.out.println();
        // }
        // for (int i = 1; i < 2 * n; i++) {
        // System.out.print("*");
        // }

        // ques 3-
        // diamond shape

        // *
        // * *
        // * *
        // * *
        // * *
        // * *
        // * *
        // * *
        // *
        // int spaces = n - 1;
        // int innersp = 1;
        // for (int row = 1; row <= n; row++) {
        // for (int i = 1; i <= spaces; i++) {
        // System.out.print(" ");
        // }
        // spaces--;
        // System.out.print("*");
        // if (row > 1) {
        // for (int j = 1; j <= innersp; j++) {
        // System.out.print(" ");
        // }
        // innersp = innersp + 2;
        // System.out.print("*");

        // }
        // System.out.println();

        // }
        // int spaces2 = 1;
        // int sp2 = (innersp - 2) - 2;

        // for (int row = n - 1; row >= 1; row--) {
        // for (int i = 1; i <= spaces2; i++) {
        // System.out.print(" ");
        // }
        // spaces2++;
        // System.out.print("*");
        // if (row > 1) {
        // for (int j = 1; j <= sp2; j++) {
        // System.out.print(" ");
        // }
        // sp2 = sp2 - 2;
        // System.out.print("*");
        // }

        // System.out.println();

        // }

        // ques 4-
        // pascal`s triangle

        int spaces = n - 1;

        for (int row = 1; row <= n; row++) {

            for (int i = 1; i <= spaces; i++) {
                System.out.print(" ");
            }
            spaces--;

            int val = 1;
            for (int col = 1; col <= row; col++) {
                System.out.print(val + " ");
                val = val * (row - col) / (col);
            }

            System.out.println();
        }

    }
}
