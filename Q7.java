package Lab_Question;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
