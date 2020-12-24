package geeksforgeeks;

public class DuplicateZeroes {
    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                i++;
            }
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        DuplicateZeroes duplicateZeros = new DuplicateZeroes();
        int arr[] = {0, 1, 1, 1, 2, 0, 0, 0};
        duplicateZeros.duplicateZeros(arr);
    }
}
