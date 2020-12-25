package Day1;

public class LastCharacterOfWordInString {
  public static void main(String[] args) {
    LastCharacterOfWordInString wordInString = new LastCharacterOfWordInString();
    String s = "My name is robert ";
    wordInString.lastCharacterOfWord(s);
  }

  private void lastCharacterOfWord(String s) {
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ' ') {
        System.out.println(s.charAt(i - 1));
      }
    }
  }
}
