package problems.Day12;

import java.util.HashMap;
import java.util.Vector;

public class SumOfAbsoluteDifferenceOfIndices {

  // Function to find sum of differences
  // of indices of occurrences of each
  // unique array element
  static void sum(int arr[], int n) {

    // Stores indices of each
    // array element
    HashMap<Integer, Vector<Integer>> mp = new HashMap<>();

    // Store the indices
    for (int i = 0; i < n; i++) {
      Vector<Integer> v = new Vector<>();
      v.add(i);
      System.out.println("Vector add [i] " + v + " " + i);

      if (mp.containsKey(arr[i])) {
        v.addAll(mp.get(arr[i]));
        System.out.println("Vector addAll " + v);
      }

      mp.put(arr[i], v);
    }

    // Stores the sums
    int[] ans = new int[n];

    // Traverse the array
    for (int i = 0; i < n; i++) {

      // Find sum for each element
      int sum = 0;

      // Iterate over the Map
      for (int it : mp.get(arr[i])) {

        // Calculate sum of
        // occurrences of arr[i]
        sum += Math.abs(it - i);
        System.out.println(" IT -> " + it);
        System.out.println(" I -> " + i);
      }
      System.out.println(" SUM -> " + sum);

      // Store sum for
      // current element
      ans[i] = sum;
    }

    // Print answer for each element
    for (int i = 0; i < n; i++) {
      System.out.print(ans[i] + " ");
    }
    return;
  }

  // Driver Code
  public static void main(String[] args) {

    // Given array
    int arr[] = {1, 3, 1, 1, 2};

    // Given size
    int n = arr.length;

    // Function call
    sum(arr, n);
  }
}
