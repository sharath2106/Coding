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

    System.out.println(names.stream().filter(e -> e.contains("z")).count());

    names.stream().forEach(s -> System.out.println(s));
    names.forEach(sout -> System.out.println(sout));
  }

  @Test
  void useStreamsWithMap() {
    List<Integer> number = Arrays.asList(2, 3, 4, 5);

    System.out.println(number.stream().map(x -> x * x).count());
  }

  @Test
  public void whenApplyDistinct_thenRemoveDuplicatesFromStreamString() {
    String str = "my name is robert my name";

    String[] split = str.split(" ");
    List<String> intList = Arrays.asList(split);
    /*
          StringTokenizer st = new StringTokenizer(str, " ");
            List<String> intList = new ArrayList<>();

            while(st.hasMoreTokens()){
                intList.add(st.nextToken());
            }
    */
    List<String> distinctIntList = intList.stream().distinct().collect(Collectors.toList());

    System.out.println(intList.stream().distinct().collect(Collectors.joining(" ")));
    System.out.println(distinctIntList);
  }

  @Test
  void useStreamsWithFilter() {
    List<Integer> number = Arrays.asList(2, 3, 4, 5);

    number.stream().filter(x -> x % 2 == 0).forEach(y -> System.out.println(y));
  }

  @Test
  public void whenStreamCount_thenGetElementCount() {
    int[] empList = new int[] {100, 200, 400, 500};
    Long empCount = Arrays.stream(empList).filter(e -> e % 3 == 0).count();

    System.out.println(empCount);
  }

  @Test
  void useStreamsWithSorted() {
    List<Integer> number = Arrays.asList(2, -3, 0, 1);

    System.out.println(number.stream().sorted().collect(Collectors.toList()));
  }

  @Test
  public void whenApplyDistinct_thenRemoveDuplicatesFromStream() {
    List<Integer> intList = Arrays.asList(2, 5, 3, 2, 4, 3);
    List<Integer> distinctIntList = intList.stream().distinct().collect(Collectors.toList());

    System.out.println(distinctIntList);
  }

  @Test
  void useStreamReduce() {
    List<Integer> number = Arrays.asList(2, 3, 4, 5, 8, 10);
    Integer reduce = number.stream().filter(x -> x % 2 == 0).reduce(0, (a, b) -> a + b);

    System.out.println(reduce);

    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    Arrays.stream(arr).sum();
  }

  @Test
  public void whenCollectByJoining_thenGetJoinedString() {
    List<String> names = new ArrayList<String>();
    names.add("abcd");
    names.add("efgh");
    names.add("ijkl");
    names.add("mnop");
    names.add("qrst");
    names.add("uvwx");
    names.add("yz");
    String empNames = names.stream().collect(Collectors.joining(", "));

    System.out.println(empNames);
  }
}
