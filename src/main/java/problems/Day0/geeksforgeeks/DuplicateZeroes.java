package problems.Day0.geeksforgeeks;

public class DuplicateZeroes {
  public void duplicateZeros(int[] arr) {
    int[] indexes = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        indexes[i] = i;
      }
    }

    if (indexes.length > 1) {
      System.out.println("Duplicates");
    }
  }

  public static void main(String[] args) {
    DuplicateZeroes duplicateZeros = new DuplicateZeroes();
    int arr[] = {0, 1, 1, 1, 2, 0, 0, 0};
    duplicateZeros.duplicateZeros(arr);
  }
}
