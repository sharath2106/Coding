package problems.chapter2.Day1.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAndReplacePattern {
    public static void main(String[] args) {
        FindAndReplacePattern pattern = new FindAndReplacePattern();
        String[] words = new String[]{"abc", "abb", "acc", "ccc"};
        String patternToCheck = "aaa";
        List<String> listOfWords = new ArrayList<>();

        for (String w : words) {
            if (pattern.matches(w, patternToCheck)) {
                listOfWords.add(w);
            }
        }
        listOfWords.forEach(System.out::println);
    }

    private boolean matches(String words, String patternToCheck) {
        char[] patternToWords = new char[26];
        char[] wordsToPatterns = new char[26];

        for(int i=0; i<words.length(); i++){
            char patternToWord = patternToCheck.charAt(i);
            char wordToPattern = words.charAt(i);

            if(patternToWords[patternToWord - 'a'] == 0){
                patternToWords[patternToWord - 'a'] = wordToPattern;
            }

            if(wordsToPatterns[wordToPattern - 'a'] == 0){
                wordsToPatterns[wordToPattern - 'a'] = patternToWord;
            }

            if(patternToWords[patternToWord-'a'] != wordToPattern
                    || wordsToPatterns[wordToPattern - 'a'] != patternToWord){
                return false;
            }
        }
        return true;
    }
}
