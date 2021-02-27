package problems.Day14;

public class MinimumMovesToRemoveInvalidParenthesis {
  public static void main(String[] args) {
    String str = "abcd()a(a(";
    System.out.println(movesToRemoveInvalidParenthesis(str));
  }

  private static String movesToRemoveInvalidParenthesis(String str) {
    char[] chars = str.toCharArray();
    int count = 0;
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == '(') {
        count++;
      } else if (chars[i] == ')') {
        if (count > 0) {
          count--;
        } else {
          chars[i] = 0;
        }
      }
    }

    count = 0;
    for (int i = chars.length - 1; i >= 0; i--) {
      if (chars[i] == ')') {
        count++;
      } else if (chars[i] == '(') {
        if (count > 0) {
          count--;
        } else {
          chars[i] = '0';
        }
      }
    }

    StringBuilder sb = new StringBuilder();
    for (char c : chars) {
      if (c != '0') {
        sb.append(c);
      }
    }

    return sb.toString();
  }
}
