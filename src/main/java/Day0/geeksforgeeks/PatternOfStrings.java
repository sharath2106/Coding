package Day0.geeksforgeeks;


public class PatternOfStrings {
    public static void main(String[] args) {
        String s = "abcasdfasdf";

        for(int i = s.length(); i>0; i--) {
            System.out.println(s.substring(0,i));
        }
    }

}
