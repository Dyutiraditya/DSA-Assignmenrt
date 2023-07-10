package Assignment_01;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        System.out.print(N);
        int sum = 0;
        int product = 1;
        while(N >= 1){
            sum = sum + N % 10;
            product = product * N % 10;
            N = N / 10;
        }
        if(sum == product){
            System.out.println(" is a spy number");
        }else{
            System.out.println(" is not a spy number");
        }
        sc.close();
    }
}
