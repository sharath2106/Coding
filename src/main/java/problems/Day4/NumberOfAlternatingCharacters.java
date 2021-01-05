package problems.Day4;

public class NumberOfAlternatingCharacters {
  public static void main(String[] args) {
    NumberOfAlternatingCharacters characters = new NumberOfAlternatingCharacters();

    String alternatingCharacters = "aassddfffeee";

    System.out.println(characters.countOfAlternatingCharacters(alternatingCharacters));
  }

  private int countOfAlternatingCharacters(String alternatingCharacters) {
    int count = 0;
    for (int i = 1; i < alternatingCharacters.length(); i++) {
      if (alternatingCharacters.charAt(i) == alternatingCharacters.charAt(i - 1)) {
        count++;
      }
    }
    return count;
  }
}
