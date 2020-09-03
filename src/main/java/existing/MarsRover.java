package existing;

public class MarsRover {

    public static void main(String[] args) {
        String S = "ABCDEFG";
        int numChanged = 0;

        for (int i = 0; i < S.length(); i++) {
            if (i % 3 == 1) {
                if (S.charAt(i) != 'O') {
                    numChanged++;
                }
            } else {
                if (S.charAt(i) != 'S') {
                    numChanged++;
                }
            }
        }

        System.out.println(numChanged);
    }
}