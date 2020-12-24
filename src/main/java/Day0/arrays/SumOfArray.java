package Day0.arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int sum = 0;

        for(int arrayValue : array) {
            sum+=arrayValue;
        }

        System.out.println(sum);
    }
}
