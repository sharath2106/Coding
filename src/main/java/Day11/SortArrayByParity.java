package Day11;

public class SortArrayByParity {

  public static void main(String[] args) {
    SortArrayByParity sort = new SortArrayByParity();
    int[] array = new int[] {7, 5, 3, 4, 2, 6};
    System.out.println(sort.sortArrayByParity(array));
  }

  public int[] sortArrayByParity(int[] A) {
    int lastEvenIndex = 0;
    for (int i = 0; i < A.length; i++) {
      if (A[i] % 2 == 0) {
        int tmp = A[lastEvenIndex];
        System.out.println("TMP --> " + tmp);
        System.out.println("A[lastEvenIndex] --> " + A[lastEvenIndex]);
        A[lastEvenIndex] = A[i];
        System.out.println("A[i] --> " + A[i]);
        A[i] = tmp;
        System.out.println("A[i] --> " + A[i]);
        lastEvenIndex++;
      }
    }
    return A;
  }
}
