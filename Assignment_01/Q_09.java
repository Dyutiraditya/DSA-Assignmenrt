package Assignment_01;

import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        double[][] arr = new double[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = in.nextDouble();
            }
        }
        System.out.println("Sum of element in the major diagonal is "+sumMajorDiagonal(arr));
    }

    public static double sumMajorDiagonal(double[][] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == j){
                    sum = sum + arr[i][j];
                }
            }
        }
        return sum;
    }
}
