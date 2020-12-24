package Day1;

import java.util.Arrays;

public class ConvertCharArrayToString {
    public static void main(String[] args) {
        ConvertCharArrayToString s1 = new ConvertCharArrayToString();
        s1.printStringFromCharArray();
        s1.printStringFromCharArrayUsingStringBuilder();
    }

    private void printStringFromCharArrayUsingStringBuilder() {
        char[] charArray = new char[]{'1', '0'};
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(charArray);
        System.out.println("Appending character array using String builder " + stringBuilder);
    }

    private void printStringFromCharArray() {
        char[] charArray = new char[]{'1', '0'};
        System.out.println(charArray);
        String str = Arrays.toString(charArray);
        System.out.println("Converting character array to String using Arrays.toString method " + str);
    }
}
