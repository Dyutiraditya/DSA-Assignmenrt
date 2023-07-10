package Assignment_01;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter person Weight in kg: ");
        double Weight = sc.nextDouble();
        System.out.print("Enter height of person in meter: ");
        double Height = sc.nextDouble();
        double BMI = Weight / Math.pow(Height, 2);
        System.out.print("The person is ");
        if(BMI < 18.5){
            System.out.println("Underweight");
        }else if(BMI > 18.5 && BMI < 24.9){
            System.out.println("Normal Weight");
        }else if(BMI > 25.0 && BMI < 29.9){
            System.out.println("Overweight");
        }else{
            System.out.println("Obese");
        }
        sc.close();
    }
}
