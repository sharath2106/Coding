import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Solution {
  //    "qwe ghhjjk";
  //    "qwe ghjk"

  public static void main(String[] args) {
    Solution solution = new Solution();

    String someString = "my name is robert";
    /*
        String someString = "my name is robert";
                  duplicate
                  space
                  ""
                  "aaaaaaaaa"
                  "AaaA"
                  "SW"
                  Different delimiter
                  Single character
    */
    solution.returnDistinctWords(someString);
  }

  private void returnDistinctWords(String someString) {
    StringTokenizer st = new StringTokenizer(someString, " ");
    String sb = new String();
    String join = null;

    while (st.hasMoreTokens()) {
      Set<Character> set = new LinkedHashSet<>();
      String token = st.nextToken();
      int length = token.length();
      for (int i = 0; i < length; i++) {
        set.add(token.charAt(i));
      }
      System.out.println(
      set.toString().replaceAll("\\[|\\]", "").replaceAll(",", ""));
    }
  }
}
