package Day0.geeksforgeeks;

import java.util.Scanner;

public class HourGlassJavaMatrix {

  public static void main(String[] args) {
    // write your code here

    int numbers[][] = new int[6][6];

    Scanner in = new Scanner(System.in);

    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        numbers[i][j] = in.nextInt();
      }
    }

    int currentHourGlass;
    int largestSum = -999;

    for (int i = 1; i < 5; i++) {
      for (int j = 1; j < 5; j++) {
        currentHourGlass = 0;
        currentHourGlass += numbers[i - 1][j - 1];
        currentHourGlass += numbers[i - 1][j];
        currentHourGlass += numbers[i - 1][j + 1];
        currentHourGlass += numbers[i][j];
        currentHourGlass += numbers[i + 1][j - 1];
        currentHourGlass += numbers[i + 1][j];
        currentHourGlass += numbers[i + 1][j + 1];
        if (currentHourGlass > largestSum) {
          largestSum = currentHourGlass;
        }
      }
    }

    System.out.printf("%d", largestSum);
  }
}
