package Day8;

import java.util.LinkedList;
import java.util.Scanner;

public class StringLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Strings input: ");
        int n = sc.nextInt();
        sc.nextLine();
        LinkedList<String> list = new LinkedList<>();
        System.out.println("Enter the Strings: ");
        for(int i = 0; i<n; i++) {
            String val = sc.nextLine();
            list.add(val);
        }
        System.out.println("Enter String, need to be counted: ");
        String k = sc.nextLine();
        System.out.println(list.contains(k));
        int c = 0;
        for(String d : list) {
            if(d.equals(k)) {
                c++;
            }
        }
        if(c > 0) {
            System.out.println(c);
        }
        sc.close();
    }
}
