package Assignment_01;

import java.util.Scanner;

public class Q_05 {
    public static int sum_Of_Digits(int a){
        int sum = 0;
        while(a >= 1){
            sum = sum + a % 10;
            a = a / 10;
        }
        if(sum > 10){
            return sum_Of_Digits(sum);
        }else{
            return sum;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int a = sc.nextInt();
        System.out.println("Sum of digits of " + a + " until the number is a single digit is " + sum_Of_Digits(a));
        sc.close();
    }
}
