package problems.Day13;/* Maximum valid password length */

public class FirstProgram{

	public static void main(String args[]) {
		FirstProgram firstProgram = new FirstProgram();
		String passwordText = "a0Ba";
		System.out.println(firstProgram.validPasswordLength(passwordText));
	}
	
	public int validPasswordLength(String password) {
		int maxUntil = 0; 	
		int maxEnd = 0;
		boolean isValidPassword= false;
		int maxPasswordLen = -1;
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
			if(isValidPassword && maxPasswordLen < maxUntil) {
				maxPasswordLen = maxUntil;
			}
		}
		return maxPasswordLen;
	}
}