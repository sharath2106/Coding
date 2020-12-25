package Day2;

public class ReturnIndexLargestNumberOfArray {
  public static void main(String[] args) {
    ReturnIndexLargestNumberOfArray index = new ReturnIndexLargestNumberOfArray();
    int[] elements = new int[] {5, 22, 3, 49};
    System.out.println(index.largestNumberIndex(elements));
  }

  private int largestNumberIndex(int[] numbers) {
    int MAX = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] > MAX) {
        MAX = numbers[i];
      }
    }
    return MAX;
  }
}
