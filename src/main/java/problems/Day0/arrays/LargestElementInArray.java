package problems.Day0.arrays;

public class LargestElementInArray {
  public static void main(String[] args) {
    int[] array = {4, 2, 6, 8, 9};
    int largestElement = 0;

    for (int arrayElement : array) {
      if (largestElement < arrayElement) {
        largestElement = arrayElement;
      }
    }
    System.out.println(largestElement);
  }
}
