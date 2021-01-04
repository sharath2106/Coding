package Day11;

import java.util.Arrays;

public class CountFrequenciesOfElements {
  public static void findCounts(int arr[], int n) {

    // Hashmap
    int hash[] = new int[n];
    Arrays.fill(hash, 0);

    // Traverse all array elements
    int i = 0;

    while (i < n) {

      // Update the frequency of array[i]
      hash[arr[i] - 1]++;

      // Increase the index
      i++;
    }
    System.out.println("\nBelow are counts " + "of all elements");
    for (i = 0; i < n; i++) {
      System.out.println((i + 1) + " -> " + hash[i]);
    }
  }

  // Driver code
  public static void main(String[] args) {
    int arr[] = {2, 3, 3, 2, 5};
    findCounts(arr, arr.length);

    int arr1[] = {1};
    findCounts(arr1, arr1.length);

    int arr3[] = {4, 4, 4, 4};
    findCounts(arr3, arr3.length);

    int arr2[] = {1, 3, 5, 7, 9, 1, 3, 5, 7, 9, 1};
    findCounts(arr2, arr2.length);

    int arr4[] = {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
    findCounts(arr4, arr4.length);

    int arr5[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    findCounts(arr5, arr5.length);

    int arr6[] = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    findCounts(arr6, arr6.length);
  }
}
