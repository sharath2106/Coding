package existing;

/* Maximum valid password length */

public class MaximumValidPasswordLength{

    public static void main(String args[]) {
        MaximumValidPasswordLength firstProgram = new MaximumValidPasswordLength();
        String passwordText = "1A3scd2io";
        System.out.println(firstProgram.validPasswordLength(passwordText));
    }

    public int validPasswordLength(String password) {
        int maxUntil = 0;
        int maxEnd = 0;
        boolean isValidPassword= false;
        int max_password_len = -1;
        for (int i = 0; i < password.length(); i++) {
            maxEnd = maxEnd + 1;
            if (Character.isUpperCase(password.charAt(i))) {
                isValidPassword = true;
            }
            if (Character.isDigit(password.charAt(i))) {
                maxEnd = 0;
                isValidPassword = false;
            }
            else if (maxUntil < maxEnd) {
                maxUntil = maxEnd;
            }
            if(isValidPassword && max_password_len < maxUntil) {
                max_password_len = maxUntil;
            }
        }
        return max_password_len;
    }
}
