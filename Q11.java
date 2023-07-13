package Lab_Question;

import java.util.Scanner;

class ll{
    public static int info;
    public ll next;
}
public class Q11 {
    public static ll create(ll node){
        Scanner sc = new Scanner(System.in);
        ll n = new ll();
        n.info = sc.nextInt();
        n.next = null;
        if (node == null) {
            node = n;
        }
        node.next = n;
        return node;
    }
    public static void display(ll node){
        ll n = node;
        while(n != null){
            System.out.println(n.info);
        }
    }
    public static ll reverse(ll node){
        ll current = null;
        ll temp = node;
        while(temp != null){
            node.next = current;
            current = node;
            node = temp;
            temp = temp.next;
        }
        return node;
    }

    public static void main(String[] args) {
        ll node = new ll();
        create(node);
        create(node);
        create(node);
        create(node);
        create(node);
        display(node);
        reverse(node);
        display(node);
    }
}
