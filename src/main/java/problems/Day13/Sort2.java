package problems.Day13;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sort2 {
  public static int solution(String S) {

    int[] lowerCase = new int[26];
    Arrays.fill(lowerCase, 0);
    int[] upperCase = new int[26];
    Arrays.fill(upperCase, 0);

    for (int i = 0; i < S.length(); i++) {
      if (S.charAt(i) >= 65 && S.charAt(i) <= 90) {
        upperCase[S.charAt(i) - 'A']++;
      } else {
        lowerCase[S.charAt(i) - 'a']++;
      }
    }

    Map<Character, Integer> m = new HashMap<>();

    for (int i = 0; i < 26; i++) {
      if (lowerCase[i] == 1 && upperCase[i] == 0) {
        m.put((char)(i + 'a'), 1);
      } else if (lowerCase[i] == 0 && upperCase[i] == 1) {
        m.put((char)(i + 'A'), 1);
      }
    }

    Arrays.fill(lowerCase, 0);
    Arrays.fill(upperCase, 0);

    int i = 0, s = 0, start = -1, end = -1;

    int minimum = Integer.MAX_VALUE;

    while (i < S.length()) {
      if (m.containsKey(S.charAt(i))) {
        while (s < i) {
          if (S.charAt(s) >= 65 && S.charAt(s) <= 90) {
            upperCase[S.charAt(s) - 'A']--;
          } else {
            lowerCase[S.charAt(s) - 'a']--;
          }
          s++;
        }
        i++;
        s = i;
      } else {
        if (S.charAt(i) >= 65 && S.charAt(i) <= 90) {
          upperCase[S.charAt(i) - 'A']--;
        } else {
          lowerCase[S.charAt(i) - 'a']--;
        }
        while (true) {
          if (S.charAt(s) >= 65 && S.charAt(s) <= 90 && upperCase[S.charAt(s) - 'A'] > 1) {
            upperCase[S.charAt(s) - 'A']--;
            s++;
          } else if (S.charAt(s) >= 97 && S.charAt(s) <= 122 && lowerCase[S.charAt(s) - 'a'] > 1) {
            lowerCase[S.charAt(s) - 'a']--;
            s++;
          } else {
            break;
          }
        }
        if (balancedString(lowerCase, upperCase)) {
          if (minimum > (i - s + 1)) {
            minimum = i - s + 1;
            start = s;
            end = i;
          }
        }
        i++;
      }
    }

    if (start == -1 || end == -1) {
      return -1;
    } else {
      StringBuilder answer = new StringBuilder();
      for (int j = start; i <= end; i++) {
        answer.append(S.charAt(j));
      }
      return answer.length();
    }
  }

  private static boolean balancedString(int[] lowerCase, int[] upperCase) {
    for (int i = 0; i < 26; i++) {
      if (lowerCase[i] != 0 && (upperCase[i] == 0)) return false;
      else if ((lowerCase[i] == 0) && (upperCase[i] != 0)) return false;
    }
    return true;
  }

  public static void main(String[] args) {
    //
    System.out.println(solution("AcZCbaBz"));
  }
}
