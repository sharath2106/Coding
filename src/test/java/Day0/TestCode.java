package Day0;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCode {

  int[] arr = {};

  @Test
  public void whenFlatMapEmployeeNames_thenGetNameStream() {
    List<List<String>> namesNested =
        Arrays.asList(
            Arrays.asList("Jeff", "Bezos"),
            Arrays.asList("Bill", "Gates"),
            Arrays.asList("Mark", "Zuckerberg"));
    System.out.println("List of List of string -----> " + namesNested);
    System.out.println("List of List of string size -----> " + namesNested.size());

    List<String> namesFlatStream =
        namesNested.stream().flatMap(Collection::stream).collect(Collectors.toList());

    System.out.println("List of string flattened -----> " + namesFlatStream);
    System.out.println("List of string flattened size -----> " + namesFlatStream.size());

    assertEquals(namesFlatStream.size(), namesNested.size() * 2);
  }

  @Test
  void forEachExample() {
    List<String> names = new ArrayList<String>();
    names.add("abcd");
    names.add("efgh");
    names.add("ijkl");
    names.add("mnop");
    names.add("qrst");
    names.add("uvwx");
    names.add("yz");

    names.stream().forEach(s -> System.out.println(s));
    names.forEach(sout -> System.out.println(sout));
  }

  @Test
  void useStreamsWithMap() {
    List<Integer> number = Arrays.asList(2, 3, 4, 5);

    number.stream().map(x -> x * x).forEach(y -> System.out.println(y));
  }

  @Test
  void useStreamsWithFilter() {
    List<Integer> number = Arrays.asList(2, 3, 4, 5);

    number.stream().filter(x -> x % 2 == 0).forEach(y -> System.out.println(y));
  }

  @Test
  void useStreamsWithSorted() {
    List<Integer> number = Arrays.asList(2, -3, 0, 1);

    System.out.println(number.stream().sorted().collect(Collectors.toList()));
  }

  @Test
  void useStreamReduce() {
    List<Integer> number = Arrays.asList(2, 3, 4, 5, 8, 10);
    Integer reduce = number.stream().filter(x -> x % 2 == 0).reduce(0, (a, b) -> a + b);

    System.out.println(reduce);
  }
}
