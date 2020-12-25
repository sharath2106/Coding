package Day0;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

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

    names.forEach(sout -> System.out.println(sout));
  }
}
