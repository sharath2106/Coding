package problems.chapter2.Day1.Algoexpert;

import java.util.ArrayList;
import java.util.List;

public class ValidateSubsequence {
    public static void main(String[] args) {
        ValidateSubsequence subsequence = new ValidateSubsequence();
        List<String> actualListOfCharacters = new ArrayList<>();
        actualListOfCharacters.add("2");
        actualListOfCharacters.add("4");
        actualListOfCharacters.add("5");
        actualListOfCharacters.add("6");
        actualListOfCharacters.add("7");

        List<String> listOfSubsequence = new ArrayList<>();
        listOfSubsequence.add("1");
        listOfSubsequence.add("3");
        listOfSubsequence.add("9");

        System.out.println(subsequence.isValid(actualListOfCharacters, listOfSubsequence));
    }

    private boolean isValid(List<String> actualListOfCharacters, List<String> listOfSubsequence) {
        int arrayIndex = 0;
        int sequenceIndex = 0;

        while (arrayIndex < actualListOfCharacters.size()
                && sequenceIndex < listOfSubsequence.size()) {
            if (actualListOfCharacters.get(arrayIndex).equals(listOfSubsequence.get(sequenceIndex))) {
                sequenceIndex++;
            }
            arrayIndex++;
        }
        return sequenceIndex == listOfSubsequence.size();
    }
}
