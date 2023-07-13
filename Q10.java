package Lab_Question;

public class Q10 {
    public static int gcd(int a, int b){
        if(b < 1){
            return a;
        }
        return gcd(b, a%b);
    }
    public static int reverse(int a){
        if(a < 10){
            return 0;
        }
        return (a / 10) + (10 * reverse(a % 10));
    }
    public static int fibonacci(int a){
        if(a < 1){
            return 1;
        }
        return fibonacci(a - 1) + fibonacci(a -2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(3));
    }
}
