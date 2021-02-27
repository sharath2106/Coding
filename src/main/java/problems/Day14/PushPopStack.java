package problems.Day14;

import java.util.Stack;

public class PushPopStack {
  public static void main(String[] args) {
    int[] pushed = new int[] {1, 2, 3, 4, 5};
    int[] popped = new int[] {4, 5, 3, 2, 1};
    System.out.println(
    pushPopStack(pushed, popped));
  }

  public static boolean pushPopStack(int[] pushed, int[] popped) {
    Stack<Integer> stack = new Stack<Integer>();
    int j = 0;
    for (int c : pushed) {
      stack.push(c);
      while (!stack.isEmpty() && j < popped.length && stack.peek() == popped[j]) {
        stack.pop();
        j++;
      }
    }

    return j == popped.length;
  }
}
