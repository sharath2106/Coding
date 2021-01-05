package problems.Day0.arrays;

public class ProductOfArray {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 6, 7};
    int product = 1;

    for (int arrayValue : array) {
      product *= arrayValue;
    }

    System.out.println(product);
  }
}
