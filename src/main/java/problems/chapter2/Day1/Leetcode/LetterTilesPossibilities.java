package problems.chapter2.Day1.Leetcode;

public class LetterTilesPossibilities {
    public static void main(String[] args) {
        LetterTilesPossibilities l = new LetterTilesPossibilities();
        System.out.println(l.numTilePossibilities("ABCDE"));
    }
    public int numTilePossibilities(String tiles) {
        int[] count = new int[26];
        for (char c : tiles.toCharArray()) {
            count[c - 'A']++;
        }
        return dfs(count);
    }

    private int dfs(int[] count) {
        int sum = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] == 0) {
                continue;
            }
            sum++;
            count[i]--;
            sum += dfs(count);
            count[i]++;
        }
        return sum;
    }
}
