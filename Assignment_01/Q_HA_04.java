package Assignment_01;

import java.util.Scanner;

public class Q_HA_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row1 = sc.nextInt();
        int column1 = sc.nextInt();
        double[][] a = new double[row1][column1];
        int row2 = sc.nextInt();
        int column2 = sc.nextInt();
        double[][] b = new double[row2][column2];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = sc.nextDouble();
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                b[i][j] = sc.nextDouble();
            }
        }
        output(a);
        System.out.println();
        output(b);
        System.out.println();
        output(addMatrix(a, b));
    }

    public static double[][] addMatrix(double[][] a, double[][] b){
        double[][] ans = new double[a.length][a[0].length];
        if(a.length != b.length && a[0].length != b[0].length){
            return ans;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                ans[i][j] = a[i][j] + b[i][j];
            }
        }
        return ans;
    }
    static void output(double[][] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(" "+arr[i][j]+" ");
            }
            System.out.print(" ]");
            System.out.println();
        }
    }
}
