package Day4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SherlockAndValidString {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String sherlockString = scan.nextLine();
    Map<Character, Integer> countChar = new HashMap<>();
    Map<Integer, Integer> countCount = new HashMap<>();
    int length = sherlockString.length();
    int i;
    for (i = 0; i < length; i++) {
      char c = sherlockString.charAt(i);
      if (countChar.containsKey(c)) {
        countChar.put(c, countChar.get(c) + 1);
      } else {
        countChar.put(c, 1);
      }
    }

    for (Map.Entry<Character, Integer> entry : countChar.entrySet()) {
      if (countCount.containsKey(entry.getValue())) {
        countCount.put(entry.getValue(), countCount.get(entry.getValue()) + 1);
      } else {
        countCount.put(entry.getValue(), 1);
      }
    }
    if (countCount.size() == 1) {
      System.out.println("YES");
    } else if (countCount.size() == 2) {
      if (countCount.containsValue(1)) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    } else {
      System.out.println("NO");
    }
  }
}
