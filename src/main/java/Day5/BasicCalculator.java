package Day5;

import static java.lang.Character.isDigit;

import java.util.Stack;

public class BasicCalculator { // Needs change in solution for division and multiplication
  public int calculate(String s) {
    if (s == null || s.length() == 0) {
      return 0;
    }

    Stack<Integer> stack = new Stack<>();
    char[] chars = s.toCharArray();
    int result = 0;
    int number = 0;
    int sign = 1;
    stack.push(sign);

    for (int i = 0; i < chars.length; i++) {
      if (isDigit(chars[i])) {
        number = number * 10 + (chars[i] - '0');
      } else if (chars[i] == '+' || chars[i] == '-') {
        result = result + sign * number;
        sign = stack.peek() * (chars[i] == '+' ? 1 : -1);
        number = 0;
      } else if (chars[i] == '(') {
        stack.push(sign);
      } else if (chars[i] == ')') {
        stack.pop();
      }
    }

    result = result + sign * number;
    return result;
  }

  public static void main(String[] args) {
    BasicCalculator calculate = new BasicCalculator();
    String expression = "(2+4)-9";
    System.out.println(calculate.calculate(expression));
  }
}
