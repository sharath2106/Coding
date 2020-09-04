package hackerrank;

import java.util.Scanner;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int max = 0;
        int sum = 0;
        int num;
        for (int i = 0; i < n; i++) {
            num = in.nextInt(); //1
            if (num > max) { //1>1
                sum = 1; //1
                max = num; //max=1
            } else if (num == max) { //1
                sum++;
            }
        }
        System.out.println(sum);
    }
}
