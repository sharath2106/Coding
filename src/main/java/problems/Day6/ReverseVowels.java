package problems.Day6;

public class ReverseVowels {
  public static void main(String[] args) {
    ReverseVowels reverse = new ReverseVowels();
    String stringToBeChanged = "baudeoj";
    System.out.println(reverse.reverseString(stringToBeChanged));
  }

  private String reverseString(String stringToBeChanged) {
    char[] stringArrray = stringToBeChanged.toCharArray();
    int i = stringToBeChanged.length() - 1;
    int j = 0;
    while (i > j) {
      char iChar = stringArrray[i];
      char jChar = stringArrray[j];
      boolean iIsVowel = isVowel(iChar);
      boolean jIsVowel = isVowel(jChar);
      if (jIsVowel && iIsVowel) {
        stringArrray[i] = jChar;
        stringArrray[j] = iChar;
        i--;
        j++;
      } else {
        if (!iIsVowel) i--;
        if (!jIsVowel) j++;
      }
    }
    return new String(stringArrray);
  }

  private boolean isVowel(char c) {
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E'
        || c == 'I' || c == 'O' || c == 'U';
  }
}
