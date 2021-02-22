package problems.Day2;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WordCounterWithBreakIterator {

  public static String getWords(String text) {
    List<String> words = new ArrayList<>();
    BreakIterator breakIterator = BreakIterator.getWordInstance();
    breakIterator.setText(text);
    int lastIndex = breakIterator.first();
    while (BreakIterator.DONE != lastIndex) {
      int firstIndex = lastIndex;
      lastIndex = breakIterator.next();
      if (lastIndex != BreakIterator.DONE && Character.isLetterOrDigit(text.charAt(firstIndex))) {
        words.add(text.substring(firstIndex, lastIndex));
      }
    }

    return words.stream().collect(Collectors.joining(" "));
  }

  public static void main(String[] args) {
    System.out.println(
        getWords(
            "A PT CR M0RT 56  8989 BOUSG SABN NTE TR/GB/(G) = RAND (MIN(XXX, YY(ABCD) + ABC))"));
  }
}
