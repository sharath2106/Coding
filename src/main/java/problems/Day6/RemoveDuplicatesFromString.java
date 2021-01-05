package problems.Day6;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromString {
  public static void main(String[] args) {
    RemoveDuplicatesFromString ds = new RemoveDuplicatesFromString();

    String input = "qwweerrrttyuuiop";
    ds.removeDuplicates(input);
  }

  private void removeDuplicates(String input) {
    char[] charArray = input.toCharArray();

    LinkedHashSet<String> set = new LinkedHashSet<>();
    for (char c : charArray) set.add(String.valueOf(c));
    System.out.println(set.stream().collect(Collectors.joining("")));
  }
}
