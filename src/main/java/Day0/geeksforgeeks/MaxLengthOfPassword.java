package Day0.geeksforgeeks;

public class MaxLengthOfPassword {
  public static void main(String[] args) {
    MaxLengthOfPassword password = new MaxLengthOfPassword();
    String passwordString = "1ATY3scd2io";
    password.checkPassword(passwordString);
  }

  public void checkPassword(String password) {
    boolean isValidPassword = false;
    int maxEnd = 0;
    int maxUntil = 0;
    int max_length = -1;
    for (int i = 0; i < password.length(); i++) {
      maxEnd += 1;
      if (Character.isUpperCase(password.charAt(i))) {
        isValidPassword = true;
      }

      if (Character.isDigit(password.charAt(i))) {
        maxEnd = 0;
        isValidPassword = false;
      }

      if (maxUntil < maxEnd) {
        maxUntil = maxEnd;
      }

      if (isValidPassword && max_length < maxUntil) {
        max_length = maxUntil;
      }
    }

    System.out.println(max_length);
  }
}
