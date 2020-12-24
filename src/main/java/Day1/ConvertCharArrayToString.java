package Day1;

import java.util.Arrays;

public class ConvertCharArrayToString {
    public static void main(String[] args) {
        ConvertCharArrayToString s1 = new ConvertCharArrayToString();
        s1.printStringFromCharArray();
    }

    private void printStringFromCharArray() {
        char[] charArray = new char[]{'1', '0'};
        System.out.println(charArray);
        String str = Arrays.toString(charArray);
        String replacedString = str.replace("[", "");
        System.out.println(replacedString);
    }
}
