package Day5;

public class CommonChildOfAString { // Needs change in solution
  public static void main(String[] args) {
    String firstString = "abcde";
    String secondString = "defgh";
    int firstStringLength = firstString.length();
    int[][] commonChars = new int[firstStringLength + 1][firstStringLength + 1];
    for (int i = 1; i <= firstStringLength; i++) {
      for (int j = 1; j <= firstStringLength; j++) {
        System.out.println("i ---> " + i + "j ---> " + j);
        if (firstString.charAt(i - 1) != secondString.charAt(j - 1)) {
          System.out.println("First string charat -----> " + firstString.charAt(i - 1));
          System.out.println("Second string charat -----> " + secondString.charAt(j - 1));
          System.out.println("FIRST LOOP 1----> " + commonChars[i][j - 1]);
          System.out.println("FIRST LOOP 2 ----> " + commonChars[i - 1][j]);
          commonChars[i][j] = Math.max(commonChars[i][j - 1], commonChars[i - 1][j]);
          System.out.println("MAX LOOP 1 ----> " + commonChars[i][j]);
        } else {
          System.out.println("SECOND LOOP ---> " + commonChars[i - 1][j - 1]);
          commonChars[i][j] = commonChars[i - 1][j - 1] + 1;
          System.out.println("MAX LOOP 2 ----> " + commonChars[i][j]);
        }
      }
    }
    System.out.println(commonChars[firstStringLength][firstStringLength]);
  }
}
