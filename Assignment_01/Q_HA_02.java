package Assignment_01;

import java.util.Scanner;

public class Q_HA_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < s.length; i++) {
            s[i] = sc.next();
        }
        for (int i = s.length-1; i >= 0 ; i--) {
            System.out.println(s[i]);
        }
    }
}
