package Lab_Question;

import java.util.Scanner;

class Phone {
    public static int areacode;
    public static int exchangenumber;
    public static void input(){
        Scanner sc = new Scanner(System.in);
        areacode = sc.nextInt();
        exchangenumber = sc.nextInt();
    }
    public static void display(){
        System.out.println("( " + areacode + " ) " + exchangenumber);
    }
}
public class Q2 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.input();
        System.out.println("My number is ");
        phone.display();
        Phone phoone = new Phone();
        phoone.input();
        System.out.println("Your number is ");
        phoone.display();
    }
}
