package Day0.geeksforgeeks;

public class RemoveAlternatingCharacters {

    public static void main(String[] args) {
        String strArr = "AAABBB";
        int counter = 0;
        char currentChar = strArr.charAt(0);

        for (int i = 1; i < strArr.length(); i++) {
            if (strArr.charAt(i) == currentChar) {
                counter++;
            } else {
                currentChar = strArr.charAt(i);
            }
        }

        System.out.println(counter);
    }
}
