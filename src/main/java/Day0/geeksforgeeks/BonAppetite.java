package Day0.geeksforgeeks;

import java.util.Scanner;

public class BonAppetite {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 4;
        int k = 1;
        int sum = 0;
        for(int i = 0; i < n; i++){
            if(i != k){
                sum += in.nextInt();
            }else{
                in.nextInt();
            }
        }
        int res = in.nextInt();
        int t = res - sum / 2;
        System.out.println(t == 0 ? ("Bon Appetit") : t);
    }
}