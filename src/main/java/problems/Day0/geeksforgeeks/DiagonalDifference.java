package problems.Day0.geeksforgeeks;

import java.util.Scanner;

public class DiagonalDifference {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = 3;
    int diag1 = 0;
    int diag2 = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        int num = in.nextInt();
        if (i == j) {
          diag1 += num;
        }
        if (i + j == n - 1) {
          diag2 += num;
        }
      }
    }
    System.out.println(diag1);
    System.out.println(diag2);
    System.out.println(Math.abs(diag1 - diag2));
  }
}
