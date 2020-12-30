package Day7;

import java.util.Arrays;
import java.util.stream.Stream;

public class PrintArray {
  public static void main(String[] args) {
    char[] arr = new char[] {'a', 'b', 'c'};

    Stream<char[]> stream = Arrays.asList(arr).stream();

    stream.forEach(System.out::println);
  }
}
