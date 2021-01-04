package Day11;

public class FindSumOfAbsoluteDifferences {
  public static void main(String[] args) {
    FindSumOfAbsoluteDifferences differences = new FindSumOfAbsoluteDifferences();

    int[] numbers = new int[] {1, 8, 9, 15, 16};
    System.out.println(differences.findSum(numbers, numbers.length));
  }

  private int findSum(int[] arr, int n) {
    int sum = 0;
    for (int i = n - 1; i >= 0; i--) {
      sum = sum + (i * arr[i] - (n - 1 - i) * arr[i]);
    }
    return sum;
  }
}
