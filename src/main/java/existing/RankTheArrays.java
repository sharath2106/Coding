package existing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankTheArrays {
    public static void main(String[] args) {
        RankTheArrays s = new RankTheArrays();
        int[] ints = {1, 44, 32, 5, 2, 5, 2};
        System.out.println(s.arrayRankTransform(ints));
    }

    public int[] arrayRankTransform(int[] arr) {
        int[] copy = arr.clone();
        Arrays.sort(copy);

        int same = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < copy.length; i++) {
            if (i > 0 && copy[i] == copy[i - 1]) {
                same++;
            }

            map.put(copy[i], i - same + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}
