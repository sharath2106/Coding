package Day0.arrays;

public class SmallestElementInArray {
    public static void main(String[] args) {
        int[] array = {4, 2, 6, 8, 9};
        int smallestElement = 9999;

        for (int arrayElement : array) {
            if (smallestElement > arrayElement) {
                smallestElement = arrayElement;
            }
        }
        System.out.println(smallestElement);
    }
}
