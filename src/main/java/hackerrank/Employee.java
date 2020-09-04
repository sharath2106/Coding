package hackerrank;

public class Employee {
    public static void main(String[] args) {
        String username = "This is a test string";
        String password = null;

        char[] charArray = username.toCharArray();
        password = String.copyValueOf(charArray);

        System.out.println(charArray);
        System.out.println(charArray.length);
        System.out.println(password);

    }
}
