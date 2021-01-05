package problems.Day0.geeksforgeeks;

import java.util.Stack;

public class ReversingWordsInAString {
  public static void main(String[] args) {
    String theString = "Hello fucking world";

    Stack s = new Stack();
    for (int i = 0; i < theString.length(); ++i) {
      if (theString.charAt(i) != ' ') {
        s.push(theString.charAt(i));
      } else {
        while (!s.empty()) {
          System.out.print(s.pop());
        }
        System.out.print(" ");
      }
    }

    while (!s.empty()) {
      System.out.print(s.pop());
    }
  }
}
