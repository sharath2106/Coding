package Day0.geeksforgeeks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringExistsSparseArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = 5;
        in.nextLine();
        Map<String, Integer> counts = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            Integer count = counts.get(s);
            count = (count == null) ? 1 : count + 1;
            counts.put(s, count);
        }
        int q = 3;
        in.nextLine();
        for (int i = 0; i < q; i++) {
            String s = in.nextLine();
            Integer count = counts.get(s);
            System.out.println(count == null ? 0 : count);
        }
    }
}


