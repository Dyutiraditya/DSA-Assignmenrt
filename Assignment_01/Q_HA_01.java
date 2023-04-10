package Assignment_01;

import java.util.Scanner;

public class Q_HA_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a+b==c&&b-c==a&&a*b==c){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
