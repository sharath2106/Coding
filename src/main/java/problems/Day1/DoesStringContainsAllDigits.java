package problems.Day1;

public class DoesStringContainsAllDigits {
  public static void main(String[] args) {
    String str = "Welcome123456789MyChannel";
    DoesStringContainsAllDigits ds = new DoesStringContainsAllDigits();
    if (ds.allDigitsPresent(str)) System.out.println("TRUE");
    else System.out.println("FALSE");
  }

  private boolean allDigitsPresent(String str) {
    boolean[] bool = new boolean[10];
    for (int i = 0; i < str.length(); i++) {
      if (isDigit(str.charAt(i))) {
        int digit = str.charAt(i) - '0';
        bool[digit] = true;
      }
    }

    return isAllDigitPresent(bool);
  }

  private boolean isAllDigitPresent(boolean[] bool) {
    for (int i = 0; i < bool.length; i++) {
      if (!bool[i]) return false;
    }
    return true;
  }

  private boolean isDigit(char charVal) {
    if (charVal >= '0' && charVal <= '9') return true;
    else return false;
  }
}
