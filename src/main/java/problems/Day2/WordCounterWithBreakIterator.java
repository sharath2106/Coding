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
      System.out.println("First Index --> "+firstIndex);
      lastIndex = breakIterator.next();
        System.out.println("Last Index --> "+lastIndex);
      if (lastIndex != BreakIterator.DONE && Character.isLetterOrDigit(text.charAt(firstIndex))) {
        System.out.println("SUBSTRING --> "+text.substring(firstIndex, lastIndex));
        System.out.println("\n");
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
