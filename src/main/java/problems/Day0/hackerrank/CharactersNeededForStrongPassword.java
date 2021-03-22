package problems.Day0.hackerrank;

import java.util.Scanner;

public class CharactersNeededForStrongPassword {

  static int minimumNumber(String password) {
    // Return the minimum number of characters to make the password strong
    String numbers = "0123456789";
    String lower_case = "abcdefghijklmnopqrstuvwxyz";
    String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String special_characters = "!@#$%^&*()-+";
    int count = 0;
    if (!contains(password, numbers)) count++;
    if (!contains(password, lower_case)) count++;
    if (!contains(password, upper_case)) count++;
    if (!contains(password, special_characters)) count++;
    int delta = Math.max(0, 6 - count - password.length());
    count += delta;
    return count;
  }

  private static boolean contains(String s, String oneOf) {
    for (char c : oneOf.toCharArray()) {
      if (s.indexOf(c) != -1) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String password = "Qwerty";
    int answer = minimumNumber(password);
    System.out.println(answer);
    in.close();
  }
}
