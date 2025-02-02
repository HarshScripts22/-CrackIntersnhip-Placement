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

        if (n % 2 != 0) {
            System.out.println("please take even no ");

        } else {

            int spaces = 0;
            int stars = n / 2;
            for (int row = 1; row <= n / 2; row++) {
                for (int i = 1; i <= spaces; i++) {
                    System.out.print(" ");
                }
                spaces++;
                for (int j = 1; j <= stars; j++) {
                    System.out.print("*" + " ");

                }
                stars--;

                System.out.println();
            }
            int sp = n / 2 - 1;
            int str = 1;
            for (int row = n / 2 + 1; row <= n; row++) {

                for (int i = 1; i <= sp; i++) {
                    System.out.print(" ");
                }
                sp--;
                for (int j = 1; j <= str; j++) {
                    System.out.print("*" + " ");
                }
                str++;

                System.out.println();
            }

        }
    }
}
