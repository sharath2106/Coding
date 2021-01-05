package problems.Day3;

import java.util.Arrays;

public class CommonSubstringInTwoStrings {
  public static void main(String[] args) {
    CommonSubstringInTwoStrings common = new CommonSubstringInTwoStrings();
    String firstString = "hellooworld";
    String twoString = "randomworld";
    System.out.println(common.isCommonSubstringPresent(firstString, twoString));
  }

  private boolean isCommonSubstringPresent(String firstString, String secondString) {
    boolean[] characters = new boolean[26];
    Arrays.fill(characters, false);

    for (int i = 0; i < firstString.length() - 1; i++) {
      characters[firstString.charAt(i) - 'a'] = true;
    }

    for (int i = 0; i < secondString.length() - 1; i++) {
      if (characters[secondString.charAt(i) - 'a']) {
        return true;
      }
    }

    return false;
  }
}
