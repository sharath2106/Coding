package hackerrank;

import java.util.HashMap;
import java.util.Scanner;

public class BearAndSteadyGene {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named existing.Solution. */
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        String s = in.nextLine();


        HashMap<Character, Integer> count = new HashMap<>();
        count.put('A', -N / 4);
        count.put('C', -N / 4);
        count.put('G', -N / 4);
        count.put('T', -N / 4);

        for (int i = 0; i < N; i++)
            count.put(s.charAt(i), count.get(s.charAt(i)) + 1);

        if (count.get('A') < 0)
            count.put('A', 0);

        if (count.get('C') < 0)
            count.put('C', 0);

        if (count.get('G') < 0)
            count.put('G', 0);

        if (count.get('T') < 0)
            count.put('T', 0);

        if (hasAll(count)) {
            System.out.println(0);
            return;
        }


        int left = -1;
        int right = -1;

        int min = Integer.MAX_VALUE;
        while (++right < N) {
            char cRight = s.charAt(right);
            count.put(cRight, count.get(cRight) - 1);

            while (hasAll(count)) {
                int diff = right - left;
                min = Math.min(min, diff);

                left++;
                char cLeft = s.charAt(left);
                count.put(cLeft, count.get(cLeft) + 1);
            }

        }

        System.out.println(min);
    }

    private static boolean hasAll(HashMap<Character, Integer> count) {
        return count.get('A') <= 0 && count.get('C') <= 0 && count.get('G') <= 0 && count.get('T') <= 0;
    }
}