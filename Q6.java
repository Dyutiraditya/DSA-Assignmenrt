package Lab_Question;
class MarksOutOfBound extends Exception {
    public MarksOutOfBound(String m){
        super(m);
    }
}
class student {
    public static int mark;
    public student (int mark) throws MarksOutOfBound{
            this.mark = mark;
        if(mark > 100){
            throw new MarksOutOfBound("");
        }

    }
}
public class Q6 {

}
