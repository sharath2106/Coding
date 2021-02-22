package problems.Day5;

import java.util.Stack;

public class BasicCalculatorSolution {
  public int calculate(String s) {

    if (s == null || s.isEmpty()) return 0;

    int len = s.length();
    Stack<Integer> stack = new Stack<Integer>();
    int currentNumber = 0;
    char currentOperation = '+';

    for (int i = 0; i < len; i++) {
      char currentChar = s.charAt(i);
      if (Character.isDigit(currentChar)) {
        currentNumber = (currentNumber * 10) + (currentChar - '0');
      }
      if (!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar) || i == len - 1) {
        if (currentOperation == '-') {
          stack.push(-currentNumber);
        } else if (currentOperation == '+') {
          stack.push(currentNumber);
        } else if (currentOperation == '*') {
          stack.push(stack.pop() * currentNumber);
        } else if (currentOperation == '/') {
          stack.push(stack.pop() / currentNumber);
        }
        currentOperation = currentChar;
        currentNumber = 0;
      }
    }
    int result = 0;
    while (!stack.isEmpty()) {
      result += stack.pop();
    }
    return result;
  }

  public static void main(String[] args) {
    BasicCalculatorSolution calculate = new BasicCalculatorSolution();
    System.out.println(calculate.calculate("1-9/1+4*9"));
  }
}
