package problems.chapter2.Day2.Leetcode;

import java.util.Arrays;

public class FindFirstAndLastPositionOfSortedArray {
    public static void main(String[] args) {
        FindFirstAndLastPositionOfSortedArray f = new FindFirstAndLastPositionOfSortedArray();
        int[] arr = new int[] {1,2,3,4,4,6};
        Arrays.stream(f.searchRange(arr, 4)).forEach(System.out::println);
    }
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1, -1};
        if (nums.length == 0) return res;
        int start = 0, end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] >= target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        if (nums[start] != target) {
            return res;
        }

        res[0] = start;

//        if(start+1 == res[0]){
//            res[1] = start+1;
//        } else{
//            res[1] = start;
//        }

        end = nums.length;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        res[1] = start - 1;

        return res;
    }
}

