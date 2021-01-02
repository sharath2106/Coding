package Day6;

public class RotateStringContainsAnotherString {
  public static void main(String[] args) {
    RotateStringContainsAnotherString string = new RotateStringContainsAnotherString();
    String firstString = "asdf";
    String secondString = "sdfa";
    System.out.println(string.rotateString(firstString, secondString));
  }

  public boolean rotateString(String a, String b) {
    if (a.length() == 0 && b.length() == 0) {
      return true;
    }
    for (char x : a.toCharArray()) {
      String firstLetter = a.substring(0, 1);
      String otherLetters = a.substring(1, a.length());
      a = otherLetters + firstLetter;
      if (a.equals(b)) {
        return true;
      }
    }
    return false;
  }
}
