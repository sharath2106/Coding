package problems.Day14;

import java.util.ArrayList;
import java.util.List;

public class FindLongestWordInAString {
  public String findLongestWord(String s, List<String> d) {
    String result = "";
    d.sort(
        (String a, String b) ->
            a.length() == b.length() ? a.compareTo(b) : b.length() - a.length());
    for (String str : d) {
      if (isSubsequence(s, str)) {
        result = str;
        return result;
      }
    }
    return result;
  }

  public boolean isSubsequence(String S, String D) {
    int i = 0, j = 0;
    if (D.length() > S.length()) return false;
    while (i < S.length() && j < D.length()) {
      if (S.charAt(i) == D.charAt(j))
          j++;
      i++;
    }
    return j == D.length();
  }

  public static void main(String[] args) {
    FindLongestWordInAString word = new FindLongestWordInAString();
    String a = "ajppkle";
    List<String> listOfStrings = new ArrayList<>();
    listOfStrings.add("apppppppppp");
    listOfStrings.add("APPLE");
    listOfStrings.add("APE");
    listOfStrings.add("apeasd");
    System.out.println(word.findLongestWord(a, listOfStrings));
  }
}

// class Solution {
//    public String findLongestWord(String s, List<String> d) {
//        String result = "";
//
//        for(String str : d) {
//            if(isSubsequence(s, str) ) {
//                //Length str > result || length is equal but str is lexicographically small.
//                if(str.length() > result.length() || (str.length() == result.length() &&
// str.compareTo(result) < 1))
//                    result = str;
//            }
//        }
//        return result;
//    }
//
//    public boolean isSubsequence(String S, String D) {
//        int i = 0, j = 0;
//        if(D.length() > S.length()) return false;
//        while(i < S.length() && j < D.length()) {
//            if(S.charAt(i) == D.charAt(j)) j++;
//            i++;
//        }
//        return j == D.length();
//    }
// }
