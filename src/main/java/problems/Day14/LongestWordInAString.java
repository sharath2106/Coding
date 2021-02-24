package problems.Day14;

import java.util.Arrays;
import java.util.HashSet;

public class LongestWordInAString {
  public String longestWordInAString(String[] a) {
    Arrays.sort(a);
    HashSet<String> s = new HashSet<>();
    String result = "";
    for (String word : a) {
      if (word.length() == 1 || s.contains(word.substring(0, word.length() - 1))) {
        if (word.length() > result.length()) result = word;
        s.add(word);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    LongestWordInAString wordInAString = new LongestWordInAString();
    String[] words = {"w", "wo", "worl", "world"};
    System.out.println(wordInAString.longestWordInAString(words));
  }
}
