package Day0.hackerrank;

import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a % 2 == 0) {
            System.out.println("It's even");
        } else {
            System.out.println("It's odd");
        }
    }
}
