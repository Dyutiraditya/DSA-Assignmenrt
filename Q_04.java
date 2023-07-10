package Assignment_01;

public class Q_04 {
    public static void main(String[] args) {
        int count = 0;
        char [] carbon = {'c', 'a', 'r', 'b', 'o', 'n'};
        for (int i = 0; i < carbon.length; i++) {
            for (int j = 0; j < carbon.length; j++) {
                for (int k = 0; k < carbon.length; k++) {
                    for (int l = 0; l < carbon.length; l++) {
                        for (int m = 0; m < carbon.length; m++) {
                            for (int n = 0; n < carbon.length; n++) {
                                if(i != j && i != k && i != l && i != m && i != n && j != k && j != l && j != m && j != n && k != l && k != m && k != n && l != m && l != n && m != n){
                                    count++;
                                    System.out.print(count + " " + carbon[i] + carbon[j] + carbon[k] + carbon[l] + carbon[m] + carbon[n] + "\n");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
