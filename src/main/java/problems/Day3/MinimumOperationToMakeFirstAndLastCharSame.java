package problems.Day3;

public class MinimumOperationToMakeFirstAndLastCharSame { // TODO BE REVISITED
  public static void main(String[] args) {
    MinimumOperationToMakeFirstAndLastCharSame minimumOperation =
        new MinimumOperationToMakeFirstAndLastCharSame();
    minimumOperation.findLength();
  }

  private void findLength() {
    String firstString = "wadbbnndyui";
    String subString = "";
    for (int i = 0; i < firstString.length(); i++) {
      for (int j = 0; j < i; j++) {
        if (firstString.charAt(i) == firstString.charAt(j)) {
          System.out.println(firstString.substring(i, j));
        }
      }
    }
  }
}
