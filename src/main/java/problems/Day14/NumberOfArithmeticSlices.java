package problems.Day14;

public class NumberOfArithmeticSlices {
  public static void main(String[] args) {
    int[] array = new int[] {1, 2, 3, 4, 8, 10, 12, 14};
    System.out.println(numberOfArithmeticSlices(array));
  }

  private static int numberOfArithmeticSlices(int[] array) {
      int[] slices = new int[array.length];
      int result = 0;
      for(int i =2;i<array.length;i++){
          if(array[i] - array[i-1] == array[i-1] - array[i-2]){
              slices[i] = 1+ slices[i-1];
              result +=slices[i];
          }
      }
      return result;
  }
}
