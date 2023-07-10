package Assignment_01;

public class Q_01 {
    public static void main(String[] args) {
        int a  = Integer.parseInt(args[0]);
        int count = 0;
        while(a > 0){
            a = a/2;
            count++;
        }
        System.out.println("The positive integer greater than 2 from command line argument is " + a + "\nThe number of times one must repeatedly divide this by 2 before getting a value less than 2 is " + count);
    }
    
}
