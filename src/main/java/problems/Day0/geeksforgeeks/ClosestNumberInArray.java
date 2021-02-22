package problems.Day0.geeksforgeeks;

public class ClosestNumberInArray {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4};

    int target = 5;
    int difference = 0;
    int closestNumber = 0;

    for (int i = 0; i < numbers.length; i++) {
      difference = target - numbers[i];

      if (difference < numbers[i]) {
//                        difference = i;
        closestNumber = numbers[i];
      }
    }
    System.out.println(closestNumber);
  }
}
