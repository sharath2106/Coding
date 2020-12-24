package Day0.hackerrank;

public class StringsEndingWithPattern {
    // Function that return true
    // if str ends with pat
    static boolean endsWith(String str, String pat) {
        int patLen = pat.length();
        int strLen = str.length();

        // Pattern is larger in length
        // than the string
        if (patLen > strLen)
            return false;

        // We match starting from the end while
        // patLen is greater than or equal to 0.
        patLen--;
        strLen--;
        while (patLen >= 0) {

            // If at any index str doesn't match
            // with pattern
            if (pat.charAt(patLen) != str.charAt(strLen))
                return false;
            patLen--;
            strLen--;
        }

        // If str ends with the given pattern
        return true;
    }

    // Function to return the
    // count of required strings
    static int countOfStrings(String pat, int n,
                              String sArr[]) {
        int count = 0;
        for (int i = 0; i < n; i++) {

            // If current string ends with
            // the given pattern
            if (endsWith(sArr[i], pat))
                count++;
        }
        return count;
    }

    // Driver code
    public static void main(String[] args) {
        String pat = "ks";
        int n = 4;
        String sArr[] = {"geeks", "Day0.geeksforgeeks", "games", "unit"};
        System.out.println(countOfStrings(pat, n, sArr));
    }
}

// This code is contributed by Rituraj Jain

