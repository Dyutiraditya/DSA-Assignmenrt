package Lab_Question;

import java.util.Scanner;

class Complex {
    public static double real;
    public static double imag;
    public static void setData(){
        Scanner sc = new Scanner(System.in);
        real = sc.nextDouble();
        imag = sc.nextDouble();
    }
    public static void display(){
        System.out.println(real +  " " + imag + "i");
    }
    public static Complex add(Complex c, Complex cc){
        Complex ans = new Complex();
        ans.real = c.real + cc.real;
        ans.imag = c.imag + cc.imag;
        return ans;
    }
}
public class Q3 {
    public static void main(String[] args) {
        Complex c = new Complex();
        c.setData();
        c.display();
        Complex cc = new Complex();
        cc.setData();
        cc.display();
        c.add(c, cc);
        c.display();
    }
}
