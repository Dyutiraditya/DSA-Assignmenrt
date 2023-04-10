package Assignment_01;

import java.util.Scanner;

public class Q_HA_02_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverse(n);
    }

    static void reverse(int n){
        if(n < 0){
            return;
        }
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        reverse(n-1);
        System.out.println(s);
    }
}
