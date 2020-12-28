package Day5;

import java.util.HashSet;
import java.util.Set;

public class CommonChildOfAString { // Needs change in solution
  public static void main(String[] args) {
    CommonChildOfAString child = new CommonChildOfAString();
    String firstString = "aabbcdasdff";
    String secondString = "hgab";

    System.out.println(child.findCommonChildOfAString(firstString, secondString));
  }

  private int findCommonChildOfAString(String firstString, String secondString) {
    Set<String> distinctWords = new HashSet<>();
    for (int i = 0; i < firstString.length(); i++) {
      for (int j = 0; j < secondString.length(); j++) {
        if (firstString.charAt(i) == secondString.charAt(j)) {
          distinctWords.add(String.valueOf(firstString.charAt(i)));
        }
      }
    }

    return distinctWords.size();
  }
}
