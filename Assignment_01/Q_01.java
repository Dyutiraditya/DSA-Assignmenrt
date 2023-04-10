package Assignment_01;

import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {
        System.out.println("The positive integer greater than 2 from command line argument is ");
        //int n = Integer.parseInt(args[0]);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("The number of times one must repeatedly divide tis number by 2 before getting a value less than 2 is "+numberOfTimes(n));
    }

    public static int numberOfTimes(int n){
        int count = 0;
        while(n > 2){
            n = n/2;
            count++;
        }
        return count;
    }
}
