package Assignment_01;

import java.util.Arrays;
import java.util.Scanner;

public class Q_HA_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        output(arr);
        System.out.println(Arrays.toString(maxRowColumn(arr)));
    }

    static int[] maxRowColumn(int[][] arr){
        int sum1 = 0;
        int sum2 = 0;
        int[] max = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == 1){
                    sum1 ++;
                }
                if(arr[j][i] == 1){
                    sum2 ++;
                }
                if(sum2 > max[1]){
                    max[1] = j;
                }
            }
            if(sum1 > max[0]){
                max[0] = i;
            }
        }
        return max;
    }
    static void output(int[][] arr){
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
