package problems.Day3;

import java.util.Vector;

public class MinOperationToMakeFirstAndLastCharSame {
  // Java program to find minimum
  // operation require to make
  // first and last character same
  static final int MAX = 256;

  // Return the minimum operation requires to
  // make string first and last character same.
  static int minimumOperation(String s) {
    int n = s.length();

    // Store indexes of first occurrences of characters.
    Vector<Integer> first_occ = new Vector<>();

    // Initialize all the elements to -1
    for (int i = 0; i < MAX; i++) first_occ.add(i, -1);

    // Initialize result
    int res = Integer.MAX_VALUE;

    // Traverse through all characters
    for (int i = 0; i < n; i++) {
      // Find first occurrence
      int x = (int) s.charAt(i);
      if (first_occ.elementAt(x) == -1) first_occ.set(x, i);

      // Update result for subsequent occurrences
      else {
        int last_occ = (n - i - 1);
        res = Math.min(res, first_occ.get(x) + last_occ);
      }
    }
    return res;
  }

  // Driven Program
  public static void main(String args[]) {
    String s = "bacdefghipalop";
    System.out.println(minimumOperation(s));
  }
}
