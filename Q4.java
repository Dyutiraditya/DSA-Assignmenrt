package Lab_Question;
abstract class Display {
    abstract public void dis();
}
class Student {
    public static String name;
    public static int rollno;
    public Student(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }
}
class Mark extends Student {
    public static int mark1;
    public static int mark2;
    public static int mark3;
    public Mark(String name, int rollno, int mark1, int mark2, int mark3){
        super(name, rollno);
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
}
interface Sports {
    public final int sport1 = 100;
    public final int sport2 = 200;
}
class get extends Display {
    public void dis(){
        System.out.println(Sports.sport1 + " " + Sports.sport2);
    }
}
