package problems.Day12;

public class RemoveDuplicateCharacters {

  public static void main(String[] args) {
    String s = "robberrtt";
    System.out.println(removeDuplicateLetters(s));
  }

  /*
 There are diff ways -
    1. use distinct after adding the characters in charArray
    2. use set by add the characters in charArray
    3. print only the chars after adding them in map
*/
  public static String removeDuplicateLetters(String s) {
    char[] arr = s.toCharArray();
    StringBuilder sb = new StringBuilder();
    int n = s.length();
    // Arrays.sort(arr);
    boolean[] visited = new boolean[26];
    int[] count = new int[26];
    for (int i = 0; i < n; i++) {
      count[arr[i] - 'a']++;
    }
    for (int i = 0; i < n; i++) {
      count[arr[i] - 'a']--;
      if (visited[arr[i] - 'a']) continue;
      while (sb.length() != 0
          && sb.charAt(sb.length() - 1) > arr[i]
          && count[sb.charAt(sb.length() - 1) - 'a'] > 0) {
        visited[sb.charAt(sb.length() - 1) - 'a'] = false;
        sb.deleteCharAt(sb.length() - 1);
      }
      visited[arr[i] - 'a'] = true;
      sb.append(arr[i]);
    }
    return sb.toString();
  }
}
