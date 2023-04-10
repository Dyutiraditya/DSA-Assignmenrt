package Assignment_01;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if(sumOfDigit(N) == productOfDigit(N)){System.out.println("So, "+N+" is a spy number");}
        else{System.out.println(N+" is not a spy number");}
    }

    public static int sumOfDigit(int n){
        int sum = 0;
        while(n > 0){
            sum = sum + (n % 10);
            n = n/10;
        }
        return sum;
    }
    public static int productOfDigit(int n){
        int product = 1;
        while(n > 0){
            product = product * (n % 10);
            n = n/10;
        }
        return product;
    }
    
}
