package problems.Day0.hackerrank;

import java.util.*;

public class HikingDirectionsProblem {

  public static void main(String[] args) {
    Scanner get = new Scanner(System.in);
    int n = get.nextInt();
    get.nextLine();
    String a = get.nextLine();
    int track = 0, state = 0, ans = 0;
    for (int i = 0; i < a.length(); i++) {
      if (a.charAt(i) == 'U') track++;
      if (a.charAt(i) == 'D') track--;
      if (track < 0) state = 1;
      if (state == 1 && track == 0) {
        ans++;
        state = 0;
      }
    }
    System.out.println(ans);
  }
}
