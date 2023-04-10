package Assignment_01;

import java.util.Arrays;
import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of Row and Column of 2D-Array :");
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] arr = new int[m][n];
        System.out.print("Enter elements of 2D-Array: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("The element of 2D array are ");
        for (int i = 0; i < m; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("The sum of element of 2D array is "+sum(arr));
    }
    public static int sum(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
        }
        return sum;
    }
}
