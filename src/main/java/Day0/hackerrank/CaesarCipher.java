package Day0.hackerrank;

import java.util.Scanner;

public class CaesarCipher {
//    public static void main(String[] args) {
//        String s = "abcd";
//
//        char[] charArray = s.toCharArray();
//
//        for (char c : charArray) {
//            int ascii = c;
//            char a = (char) (ascii+2);
//            System.out.println(a);
//        }
//    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        s.nextLine();
        String str = s.nextLine();
        int shift = s.nextInt();

        char sarr[] = str.toCharArray();
        for (int i = 0; i < sarr.length; i++) {
            sarr[i] = cryptIt(sarr[i], shift);
        }
        System.out.println(new String(sarr));
    }

    public static char cryptIt(char c, int shift) {
        if (!Character.isAlphabetic(c))
            return c;
        char base = 'A';
        if (c >= 'a')
            base = 'a';

        return (char) (((c - base + shift) % 26) + base);
    }

}
