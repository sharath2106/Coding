package Day2;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateNumberInArray {
  public static void main(String[] args) {
    FirstDuplicateNumberInArray duplicateNumberInArray = new FirstDuplicateNumberInArray();
    int[] numbers = new int[] {1, 2, 1, 2, 4, 6, 7};
    System.out.println(duplicateNumberInArray.findDuplicate(numbers));
  }

  private int findDuplicate(int[] numbers) {
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < numbers.length; i++) {
      if (!set.add(numbers[i])) {
        return numbers[i];
      }
    }
    return -1;
  }
}
