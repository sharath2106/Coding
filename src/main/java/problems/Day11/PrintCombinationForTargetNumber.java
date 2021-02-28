package problems.Day11;

public class PrintCombinationForTargetNumber {
  public static void main(String[] args) {
    /*
        int[] numbers = new int[] {1, 2, 3, 4};
        int targetNumber = 1;
        findCombination(numbers, targetNumber);
    */
    int n = 5;
    findCombinations(n);
  }

  /*
    private static void findCombination(int[] numbers, int targetNumber) {
      for (int i = 0; i < numbers.length; i++) {
        for (int j = 0; j < numbers.length; j++) {
          if (numbers[i] + numbers[j] == targetNumber) {
            System.out.println(numbers[i] + " " + numbers[j]);
          }
        }
      }
    }
  */

  /* arr - array to store the
  combination
  index - next location in array
  num - given number
  reducedNum - reduced number */
  static void findCombinationsUtil(int arr[], int index, int num, int reducedNum) {
    // Base condition
    if (reducedNum < 0) return;

    // If combination is
    // found, print it
    if (reducedNum == 0) {
      for (int i = 0; i < index; i++)
          System.out.print(arr[i] + " ");
      System.out.println();
      return;
    }

    // Find the previous number
    // stored in arr[]. It helps
    // in maintaining increasing
    // order
    int prev = (index == 0) ? 1 : arr[index - 1];

    // note loop starts from
    // previous number i.e. at
    // array location index - 1
    for (int k = prev; k <= num; k++) {
      // next element of
      // array is k
      arr[index] = k;

      // call recursively with
      // reduced number
      findCombinationsUtil(arr, index + 1, num, reducedNum - k);
    }
  }

  /* Function to find out all
  combinations of positive
  numbers that add upto given
  number. It uses findCombinationsUtil() */
  static void findCombinations(int n) {
    // array to store the combinations
    // It can contain max n elements
    int arr[] = new int[n];

    // find all combinations
    findCombinationsUtil(arr, 0, n, n);
  }
}
