package Lab_Question;
abstract class Shape {
    abstract int getarea();
}
class Square extends Shape{
    public static int side;
    int getarea(){
        return side * side;
    }

}
public class Q5 {
}
