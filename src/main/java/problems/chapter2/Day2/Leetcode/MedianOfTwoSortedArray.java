package problems.chapter2.Day2.Leetcode;

import java.util.Arrays;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        MedianOfTwoSortedArray m = new MedianOfTwoSortedArray();
        int[] nums1 = new int[]{1, 5};
        int[] nums2 = new int[]{2, 4};
        System.out.println(m.mergeArrays(nums1, nums2));
    }

    private double mergeArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;

        int[] nums3 = new int[n1 + n2];

        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                nums3[k] = nums1[i];
                k++;
                i++;
            } else {
                nums3[k] = nums2[j];
                k++;
                j++;
            }
        }
        while (i < n1) {
            nums3[k] = nums1[i];
            k++;
            i++;
        }
        while (j < n2) {
            nums3[k] = nums2[j];
            k++;
            j++;
        }

        if(nums3.length%2 == 0){
            return (double) (((double) nums3[nums3.length / 2] + (double) nums3[(nums3.length / 2) - 1] )/ 2);
        } else {
            return (double) (nums3[(nums3.length/2)]);
        }
    }
}
