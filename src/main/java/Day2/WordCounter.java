package Day2;

import java.text.BreakIterator;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WordCounter {

  public static class WordCount {
    protected String word = null;
    protected int count = 0;
  }

  public static void main(String[] args) {
    WordCounter counter = new WordCounter();
    counter.countWords("I want to know what happened!!", Locale.ENGLISH);
  }

  public static Map<String, WordCount> countWords(String text, Locale locale) {
    Map<String, WordCount> wordCounts = new HashMap<String, WordCount>();

    BreakIterator breakIterator = BreakIterator.getWordInstance(locale);
    breakIterator.setText(text);

    int wordBoundaryIndex = breakIterator.first();
    int prevIndex = 0;
    while (wordBoundaryIndex != BreakIterator.DONE) {
      String word = text.substring(prevIndex, wordBoundaryIndex).toLowerCase();
      if (isWord(word)) {
        WordCount wordCount = wordCounts.get(word);
        if (wordCount == null) {
          wordCount = new WordCount();
          wordCount.word = word;
        }
        wordCount.count++;
        wordCounts.put(word, wordCount);
      }
      prevIndex = wordBoundaryIndex;
      wordBoundaryIndex = breakIterator.next();
    }
    wordCounts.entrySet().forEach(System.out::println);
    return wordCounts;
  }

  private static boolean isWord(String word) {
    if (word.length() == 1) {
      return Character.isLetterOrDigit(word.charAt(0));
    }
    return !"".equals(word.trim());
  }
}
