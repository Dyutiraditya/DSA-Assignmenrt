package Lab_Question;
public class Q9 {
    public static <E> void arr(E[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        Integer[] i = {1, 2, 3, 4, 5, 6, 7};
        String[] s = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};
        arr(i);
        arr(s);
    }
}
