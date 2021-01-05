package problems.Day6;

public class CompareStrings {

  public static void main(String[] args) {
    CompareStrings compareStrings = new CompareStrings();
    String firstString = "ABCD";
    String secondString = "ABC";

    System.out.println(compareStrings.compareStrings(firstString, secondString));
  }

  public boolean compareStrings(String A, String B) {
    // write your code here
    if (A.length() < B.length()) {
      return false;
    }
    int[] count = new int[26];
    for (int i = 0; i < B.length(); i++) {
      int index = B.charAt(i) - 'A';
      count[index]++;
    }
    for (int i = 0; i < A.length(); i++) {
      int index = A.charAt(i) - 'A';
      count[index]--;
    }
    for (int i = 0; i < 26; i++) {
      if (count[i] > 0) {
        return false;
      }
    }
    return true;
  }
}
