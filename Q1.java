package Lab_Question;

public class Q1 {
    public static void main(String[] args) {
        char[] carbon = {'c', 'a', 'r', 'b', 'o', 'n'};
        int count = 0;
        for (int i = 0; i < carbon.length; i++) {
            for (int j = 0; j < carbon.length; j++) {
                for (int k = 0; k < carbon.length; k++) {
                    for (int l = 0; l < carbon.length; l++) {
                        for (int m = 0; m < carbon.length; m++) {
                            for (int n = 0; n < carbon.length; n++) {
                                if(i != j && i != k && i != l && i != m && i != n && j != k && j != l && j != m && j != n && k != l && k != m && k != n && l != m && l != n && m != n){
                                    System.out.println(carbon[i] + "" + carbon[j] + "" + carbon[k] + "" + carbon[l] + "" + carbon[m] + "" + carbon[n]);
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}