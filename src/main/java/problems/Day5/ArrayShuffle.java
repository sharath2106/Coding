package problems.Day5;

public class ArrayShuffle {
  public static void main(String[] args) {
    ArrayShuffle shuffle = new ArrayShuffle();
    int[] arr = new int[] {1, 2, 3, 4, 5, 6};
    int shuffleNumber = 3;

    int[] shuffledArray = shuffle.returnShuffledArray(arr, shuffleNumber);
    int length = shuffledArray.length;
    for (int i = 0; i < length; i++) {
      System.out.println(shuffledArray[i]);
    }
  }

  private int[] returnShuffledArray(int[] nums, int n) {
    //    List<Integer> list = new ArrayList<>();
    int[] result = new int[nums.length];
    if (nums.length % n == 0) {
      for (int i = 0; i < n; i++) {
        //        list.add(nums[i]);
        //        list.add(nums[i + n]);
        result[2 * i] = nums[i];
        result[2 * i + 1] = nums[i + n];
      }
    }
    //    return list.stream().mapToInt(i -> i).toArray();
    return result;
  }
}
