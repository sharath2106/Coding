package practice;

import java.util.HashSet;
import java.util.Set;

public class WeightedString {
    public static void main(String[] args) {
        String str = "aabbcccddeeff";

        Set<Integer> hashSet = new HashSet<>();
        char previous = '.';
        int previousWeight = 0;
        for (char c : str.toCharArray()) {
            if (c == previous) {
                previousWeight += c - 'a' + 1;
            } else {
                previous = c;
                previousWeight = c - 'a' + 1;
            }
            hashSet.add(previousWeight);
        }

        if(hashSet.contains(1)){
            System.out.println("YES");
        } else
            System.out.println("NO");
    }

}
