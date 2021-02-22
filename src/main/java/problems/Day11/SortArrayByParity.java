package problems.Day11;

public class SortArrayByParity {

  public static void main(String[] args) {
    SortArrayByParity sort = new SortArrayByParity();
    int[] array = new int[] {7, 5, 3, 4, 2, 6};
    int[] byParity = sort.sortArrayByParity(array);
    for (int i : byParity) {
      System.out.println(i);
    }
  }

  public int[] sortArrayByParity(int[] A) {
    int j = 0;
    for (int i = 0; i < A.length; i++) {
      if (A[i] % 2 == 0) {
        int tmp = A[j];
        //        System.out.println("TMP --> " + tmp);
        //        System.out.println("A[j] --> " + A[j]);
        A[j] = A[i];
        //        System.out.println("A[i] --> " + A[i]);
        A[i] = tmp;
        //        System.out.println("A[i] --> " + A[i]);
        j++;
      }
    }
    return A;
  }
}
