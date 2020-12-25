package Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayListToStringArray {
  public static void main(String[] args) {
    ConvertArrayListToStringArray convert = new ConvertArrayListToStringArray();
    convert.convertArrayList();
  }

  private void convertArrayList() {
    List<String> listOfStrings = new ArrayList<String>();
    listOfStrings.add("a");
    listOfStrings.add("a");
    listOfStrings.add("a");
    listOfStrings.add("a");

    String[] stringArray = new String[listOfStrings.size()];

    for (int i = 0; i < listOfStrings.size(); i++) {
      stringArray[i] = listOfStrings.get(i);
    }

    System.out.println(Arrays.toString(stringArray));
  }
}
