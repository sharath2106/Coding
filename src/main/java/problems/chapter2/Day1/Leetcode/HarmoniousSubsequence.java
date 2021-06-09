package problems.chapter2.Day1.Leetcode;

import java.util.HashMap;

public class HarmoniousSubsequence {
    public static void main(String[] args) {
        HarmoniousSubsequence h = new HarmoniousSubsequence();
        System.out.println(h.countOfHarmoniousSubsequence(new int[]{1,2,1,1,2,3,3,3,3}));
    }

    private int countOfHarmoniousSubsequence(int[] arr) {
        int result =0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i:arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(int i: map.keySet()) {
            if (map.containsKey(i + 1)) {
                result = Math.max(result, map.get(i) + map.get(i + 1));
            }
        }

        return result;
    }
}
