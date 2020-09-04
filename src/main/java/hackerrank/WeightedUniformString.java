package hackerrank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WeightedUniformString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
//        String s = "ABCD";

        Set<Integer> weights = new HashSet<Integer>();
        char previous = 'A';
        int previousWeight = 0;
        for (char c : s.toCharArray()) {
            if (c == previous) {
                previousWeight += (c - 'a') + 1;
            } else {
                previous = c;
                previousWeight = (c - 'a') + 1;
            }
            weights.add(previousWeight);
        }

        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            if (weights.contains(x)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}