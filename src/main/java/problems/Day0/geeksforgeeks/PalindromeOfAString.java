package problems.Day0.geeksforgeeks;

public class PalindromeOfAString {
  public static void main(String[] args) {
    String s = "abcd";
    int[] frequency = new int[26];

    for (int i = 0; i < s.length() - 1; i++) {
      frequency[s.charAt(i) - 'a']++;
    }

    boolean singleFound = false;
    String ans = "YES";
    for (int j = 0; j < frequency.length; j++) {
      if (frequency[j] % 2 != 0) {
        if (singleFound) {
          ans = "NO";
          break;
        } else {
          singleFound = true;
        }
      }
    }
    System.out.println(ans);
  }
}
