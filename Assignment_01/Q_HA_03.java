package Assignment_01;

import java.util.Arrays;
import java.util.Scanner;

public class Q_HA_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] a = new int[m];
        int n = sc.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(dotProduct(a, b)));
    }

    static int[] dotProduct(int[] a, int[]b){
        int n = Math.min(a.length, b.length);
        int[] ans = new int[n];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = a[i] * b[i];
        }
        return ans;
    }
}
