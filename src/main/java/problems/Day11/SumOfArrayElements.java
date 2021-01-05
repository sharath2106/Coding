package problems.Day11;

public class SumOfArrayElements {
  public static void main(String[] args) {
    SumOfArrayElements sum = new SumOfArrayElements();
    int[] array = new int[] {1, 2, 3, 5, 6, 7};
    sum.runningSum(array);
  }

  /*
    private int[] runningSum(int[] array) {
      int[] result = new int[array.length];

      result[0] = array[0];
      for (int i = 1; i < array.length; i++) {
        int sum = 0;
        for (int j = 0; j <= i; j++) {
          sum += array[j];
        }
        result[i] = sum;
      }
      return result;
    }
  */
  private int[] runningSum(int[] nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum = sum + nums[i];
      nums[i] = sum;
    }
    for (int i : nums) {
      System.out.println(i);
    }
    return nums;
  }
}
