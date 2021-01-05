package problems.Day5;

public class CommonChildOfAString { // Needs change in solution
  public static void main(String[] args) {
    String firstString = "abcde";
    String secondString = "fghyu";
    int firstStringLength = firstString.length();
    int[][] commonChars = new int[firstStringLength + 1][firstStringLength + 1];
    for (int i = 1; i <= firstStringLength; i++) {
      for (int j = 1; j <= firstStringLength; j++) {
        if (firstString.charAt(i - 1) != secondString.charAt(j - 1)) {
          commonChars[i][j] = Math.max(commonChars[i][j - 1], commonChars[i - 1][j]);
        } else {
          commonChars[i][j] = commonChars[i - 1][j - 1] + 1;
        }
      }
    }
    System.out.println(commonChars[firstStringLength][firstStringLength]);
  }
}
