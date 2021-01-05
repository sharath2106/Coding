package problems.Day0.hackerrank;

import java.util.Scanner;

public class ExistenceOfStringInAnother {

  private static final String code = "problems.Day0";

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();

    int counter = 0;
    for (int i = 0; i < s.length(); i++) {
      System.out.println("String ----> " + s.charAt(i));
      System.out.println("Code -----> " + code.charAt(counter));
      if (s.charAt(i) == code.charAt(counter)) {
        counter++;
        if (counter == code.length()) {
          break;
        }
      }
    }
    System.out.println(counter == code.length() ? "YES" : "NO");
  }
}
