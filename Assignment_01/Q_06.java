package Assignment_01;

import java.util.Arrays;
import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = in.nextInt();
        System.out.println(n+" is odd: "+isOdd(n));
    }

    public static int[] binary(int n){
        int[] ans = new int[10];
        int i = 0;
        while(n > 0){
            ans[i] = n % 2;
            n = n/2;
            i++;
        }
        return ans;
    }
    public static boolean isOdd(int n){
        int[] ans = binary(n);
        if(ans[9] == 1){
            return true;
        }
        return true;
    }
}
