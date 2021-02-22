package problems.Day13;

import java.util.HashMap;
import java.util.Map;

public class CanFormArrayFromAnother {
  public static void main(String[] args) {
    int[] arr = new int[] {1, 2, 3, 4};
    int[][] pieces = new int[][] {{1}, {2}, {3, 4}, {3, 4, 1}};

    System.out.println(canFormArray(arr, pieces));
  }

  private static boolean canFormArray(int[] arr, int[][] pieces) {
    int n = arr.length;
    Map<Integer, int[]> hm = new HashMap<>();

    for (int[] p : pieces) {
      hm.put(p[0], p);
    }

    for (int i = 0; i < n; i++) {
      if (hm.containsKey(arr[i])) {
        int[] p = hm.get(arr[i]);
        for (int pp : p) {
          if (pp == arr[i]) {
            i++;
          } else {
            return false;
          }
        }
      } else {
        return false;
      }
      i--;
    }
    return true;
  }
}
