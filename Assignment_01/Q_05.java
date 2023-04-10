package Assignment_01;

import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = in.nextInt();
        System.out.println("Sum of digits of "+n+" until a number is a single digits "+sumOfDigits(n));
    }
    public static int sumOfDigits(int n){
        if(n/10 < 1){
            return n;
        }
        int sum = 0;
        while(n > 0){
            sum = sum + (n % 10);
            n = n/10;
        }
        return sumOfDigits(sum);
    }
}
