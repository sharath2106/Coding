package problems.Day0.hackerrank;

import java.util.Scanner;

public class StringConstruction {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    //        int n = in.nextInt();
    for (int a0 = 0; a0 < 1; a0++) {
      //            String s = in.next();
      String s = "abcdacc";
      int ans = 0;
      boolean d[] = new boolean[26];
      for (int i = 0; i < s.length(); i++) {
        if (!d[s.charAt(i) - 'a']) ans++;
        d[s.charAt(i) - 'a'] = true;
      }
      System.out.println(ans);
    }
  }
}
