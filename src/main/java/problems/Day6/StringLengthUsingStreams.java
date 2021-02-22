package problems.Day6;

import java.util.stream.Stream;

public class StringLengthUsingStreams {
  public static void main(String[] args) {
    String str = "12491663061859565061";
    char[] charArray = str.toCharArray();
    char[] charArray2 = new char[charArray.length];
    for (int i = 0; i < charArray.length; i++) {
      charArray2[i] = charArray[i];
    }
    System.out.println(charArray2);
    Stream<Character> charStream = new String(charArray2).chars().mapToObj(i -> (char) i);
    charStream.forEach(x -> System.out.print(x));
  }
}
