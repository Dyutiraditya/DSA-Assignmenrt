package Assignment_01;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter person weight in kg :");
        double weight = in.nextDouble();
        System.out.println("Enter height of person in meters :");
        double height = in.nextDouble();
        if(bmi(weight, height) < 18.5){System.out.println("Underweight");}
        else if(bmi(weight, height) < 24.9 && bmi(weight, height) > 18.5){System.out.println("Normal Weight");}
        else if(bmi(weight, height) < 25.0 && bmi(weight, height) > 24.9){System.out.println("Overweight");}
        else{System.out.println("Obese");}
        in.close();
    }

    public static double bmi(double a, double b){
        return a/(Math.pow(b, 2));
    }
}
