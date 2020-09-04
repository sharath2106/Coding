package practice.arrays;

public class SumOfAdjacentElements {
    public static void main(String[] args) {
        int[] elements = {5, 2, 3, 4};
        int[] result = new int[elements.length];
        int length = elements.length - 1;

        for (int i = 0; i < length; i++) {
            result[i] = elements[i] + elements[length];
            length--;
            System.out.println(result[i]);
        }
    }
}
