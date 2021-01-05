package problems.Day11;

import java.util.Arrays;

public class MoveNegativeBeginningPositiveEnd {
  public static void main(String args[]) {
    int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
    int n = arr.length;

    rearrangeAndPrintArray(arr, n);
  }

  static void rearrangeAndPrintArray(int arr[], int n) {
    int j = 0, temp;
    for (int i = 0; i < n; i++) {
      if (arr[i] < 0) {
        if (i != j) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
        j++;
      }
    }
    Arrays.stream(arr).sorted().forEach(i -> System.out.print(i + "\t"));
  }
}
