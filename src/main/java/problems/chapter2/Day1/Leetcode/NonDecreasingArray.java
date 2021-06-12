package problems.chapter2.Day1.Leetcode;

public class NonDecreasingArray {
    public static void main(String[] args) {
        NonDecreasingArray n = new NonDecreasingArray();
        int[] arr = new int[]{1, 4, 4, 2, 3};
        System.out.println(n.isNonDecreasing(arr));
    }

    private boolean isNonDecreasing(int[] arr) {
        int pos = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                if (pos != -1) {
                    return false;
                }
                pos = i;
            }
        }

        return pos == -1 || pos == 0 || pos == arr.length - 2 || arr[pos - 1] <= arr[pos + 1] || arr[pos] <= arr[pos + 2];
    }
}
