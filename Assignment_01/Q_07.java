package Assignment_01;

import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of element of array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Maximum element of array is "+maxElement(arr)+" and occurs "+count(arr, maxElement(arr))+" times");
        System.out.println("Minimum element of array is "+minElement(arr)+" and occurs "+count(arr, minElement(arr))+" times");
        System.out.println("First occurrence of maximum element is at position "+firstOccurenceOfMax(arr));
        System.out.println("Last occurrence of minimum element is at position "+lastOccurrenceOfMin(arr));
    }

    public static int maxElement(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int minElement(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int count(int[] arr, int n){
        int counte = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == n){
                counte ++;
            }
        }
        return counte;
    }

    public static int firstOccurenceOfMax(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(maxElement(arr) == arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static int lastOccurrenceOfMin(int[] arr){
        int pos = -1;
        for (int i = 0; i < arr.length; i++) {
            if(minElement(arr) == arr[i]){
                pos = i;
            }
        }
        return pos;
    }
}
