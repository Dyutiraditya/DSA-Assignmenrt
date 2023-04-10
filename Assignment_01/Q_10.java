package Assignment_01;

import java.util.Arrays;
import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        double[][] arr = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = in.nextDouble();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+", ");
            }
            System.out.print(" ]");
            System.out.println();
        }

        int columnIndex = in.nextInt();
        System.out.println("Sum of elements of column "+columnIndex+" is "+sumColumn(arr, columnIndex));
    }

    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum = sum + m[i][columnIndex];
        }
        return sum;
    }
}
