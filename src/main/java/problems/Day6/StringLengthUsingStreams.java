package problems.Day6;

public class StringLengthUsingStreams {
  public static void main(String[] args) {
    String str = "12491663061859565061";
    char[] charArray = str.toCharArray();
    char[] charArray2 = new char[charArray.length];
    for (int i = 0; i < charArray.length; i++) {
      charArray2[i] = charArray[i];
    }
    System.out.println(charArray2);
  }
}
