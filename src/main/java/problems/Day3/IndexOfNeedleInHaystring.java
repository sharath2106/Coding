package problems.Day3;

public class IndexOfNeedleInHaystring {
  public static void main(String[] args) {
    IndexOfNeedleInHaystring index = new IndexOfNeedleInHaystring();
    String hayString = "abc";
    String needle = "abc";
    System.out.println(index.returnIndexOfNeedle(hayString, needle));
  }

  private int returnIndexOfNeedle(String haystack, String needle) {
    if (haystack.equals("") && needle.equals("")) {
      return 0;
    } else if (haystack.equals("") || needle.equals("")) {
      return 0;
    } else {
      char firstCharacter = needle.charAt(0);
      for (int i = 1; i < haystack.length(); i++) {
        if (haystack.charAt(i) == firstCharacter) {
          return haystack.indexOf(firstCharacter);
        }
      }
      return -1;
    }
  }
}
