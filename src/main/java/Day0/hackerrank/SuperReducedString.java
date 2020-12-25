package Day0.hackerrank;

import java.util.*;

public class SuperReducedString {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int cases = 1; // in.nextInt();
    for (int i = 0; i < cases; i++) {
      String s = "aaabbbddc";
      System.out.println(superreduce(s));
    }
  }

  public static String superreduce(String s) {
    boolean changed = true;
    while (changed) {
      changed = false;
      for (int i = 0; i < s.length() - 1; i++) {
        if (s.charAt(i) == s.charAt(i + 1)) {
          s = s.substring(0, i) + s.substring(i + 2);
          changed = true;
          break;
        }
      }
    }
    if (s.length() == 0) {
      return "Empty String";
    }
    return s;
  }
}
