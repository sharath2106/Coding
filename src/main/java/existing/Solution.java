package existing;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  //5
        int[] colors = new int[101];
        for (int i = 0; i < n; ++i) {
            int c = in.nextInt();
            colors[c]++;
        }
        System.out.println(Arrays.stream(colors).map(count -> count / 2).sum());
    }
}