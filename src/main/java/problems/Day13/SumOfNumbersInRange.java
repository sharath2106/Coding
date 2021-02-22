package problems.Day13;

public class SumOfNumbersInRange {
  public static void main(String[] args) {
    int start = 1, end = 1, sum = 0;

    if (start == end) {
      System.out.println(start + end);
    }

    if (start < end) {
      System.out.println("End is greater than start");
    }

    for (int i = start; i < end + 1; i++) {
      sum = sum + i;
      System.out.println(i);
    }
    System.out.println(sum);
  }
}
