package Day2;

public class AddWeightToCharactersOfString {
  public static void main(String[] args) {
    AddWeightToCharactersOfString ds = new AddWeightToCharactersOfString();
    String s = "abcd";
    System.out.println(ds.addWeightToCharacters(s));
  }

  private String addWeightToCharacters(String s) {
    int length = s.length();
    String newString = "";
    for (int i = 0; i < length - 1; i++) {
      newString = String.valueOf(s.charAt(i + length - i));
    }
    return newString;
  }
}
