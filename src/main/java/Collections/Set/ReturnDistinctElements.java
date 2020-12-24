package Collections.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ReturnDistinctElements {
    public static void main(String[] args) {
        Set<String> distinctWords = new HashSet<>(Arrays.asList(args));
        System.out.println(distinctWords.size() +
                " distinct words: " +
                distinctWords);
    }
}