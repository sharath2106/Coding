package practice;

import java.util.Scanner;

public class StaircaseWithHash {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int i, j, k, n =5;

        for (i = 0; i < n; i++) {
        int counter=1;

            for (k = 0; k <= i; k++) {
                System.out.print(counter);
                counter++;
            }
//            for (j = n - 1; j > i; j--) {
//                System.out.print(" ");
//            }
            System.out.println();
        }

    }
}
