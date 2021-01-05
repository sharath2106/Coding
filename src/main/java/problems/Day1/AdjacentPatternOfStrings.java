package problems.Day1;

public class AdjacentPatternOfStrings {
  public static void main(String[] args) {
    AdjacentPatternOfStrings adjacent = new AdjacentPatternOfStrings();
    String pattern = "abcdefgh";
    adjacent.printAdjacentChars(pattern);
  }

  private void printAdjacentChars(String stringToBeChanged) {
    String theString = "";
    for (int i = 0; i < stringToBeChanged.length(); ) {
      theString = theString + stringToBeChanged.charAt(i);
      i = i + 2;
    }
    System.out.println(theString);
  }
}

// abcdefgh
// a c e g
// b d f h
