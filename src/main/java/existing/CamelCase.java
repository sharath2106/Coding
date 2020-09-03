package existing;

public class CamelCase {
    public static void main(String[] args) {
        String string = "camelCaseIsToBeChecked";
        int counter = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) <= 'Z') {
                counter++;
            }
        }
        System.out.println(counter+1);
    }
}
