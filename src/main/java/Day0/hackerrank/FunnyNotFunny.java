package Day0.hackerrank;

import java.util.Scanner;

public class FunnyNotFunny {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int t = 0; t < T; t++) {
            String s = in.next();
            int n = s.length();
            boolean funny = true;
            for (int i = 1; i < n; i++) {
                if (Math.abs(s.charAt(i) - s.charAt(i - 1)) != Math.abs(s.charAt(n - i - 1) - s.charAt(n - (i - 1) - 1))) {
                    funny = false;
                    break;
                }
            }
            if (funny) System.out.println("Funny");
            else System.out.println("Not Funny");
        }
    }
}