package problems.Day12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementInSecondArray {
  public static void main(String[] args) {
    int[] array1 = new int[] {1, 2, 3, 4};
    int[] array2 = new int[] {2, 2, 5, 1, 9, 3};

    findNextGreaterElement(array1, array2);
  }

  private static void findNextGreaterElement(int[] nums1, int[] nums2) {
    int n1 = nums1.length;
    int n2 = nums2.length;
    Stack<Integer> stk = new Stack<>();
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < n2; i++) {
      while (!stk.isEmpty() && stk.peek() < nums2[i]) {
        int val = stk.pop();
        map.put(val, nums2[i]);
      }
      stk.push(nums2[i]);
    }

    for (int j = 0; j < n1; j++) {
        nums1[j] = map.getOrDefault(nums1[j], -1);
    }
    Arrays.stream(nums1).forEach(System.out::println);
  }
}
