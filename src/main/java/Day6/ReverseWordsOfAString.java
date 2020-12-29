package Day6;

import java.util.StringTokenizer;

public class ReverseWordsOfAString {
  public static void main(String[] args) {
    ReverseWordsOfAString reverse = new ReverseWordsOfAString();

    String sentence = "monkey shoulder and ballantines";
    System.out.println(reverse.reverseWords(sentence));
  }

  private String reverseWords(String sentence) {
    StringTokenizer st = new StringTokenizer(sentence);
    String strReversed = "";

    while (st.hasMoreTokens()) {
      strReversed = st.nextToken() + " " + strReversed;
    }
    return strReversed;
  }
}
