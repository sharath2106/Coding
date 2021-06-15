package problems.chapter2.Day2.Leetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum two = new TwoSum();
        int[] arr = new int[]{1, 3, 2, 4};
        int target = 7;

        Arrays.stream(two.findPairs(arr, target)).forEach(s -> System.out.println(s));
    }

    private int[] findPairs(int[] nums, int target) {
        int[] pairs = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    pairs[0] = i;
                    pairs[1] = j;
                    return pairs;
                }
            }

        }
        return pairs;
    }
}
