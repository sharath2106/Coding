package practice;

public class CamelCase {
    public static void main(String[] args) {
        String str = "someRandomCamelCaseProblems";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) <= 'Z' && str.charAt(i) >= 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}
