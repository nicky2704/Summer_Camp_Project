package Day7;

import java.util.Scanner;

public class DivisionException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        try {
            int res = n/m;
            System.out.println(res);
        } catch(Exception e)
        {
            System.out.println("Cannot divide by zero");
        }
        sc.close();
    }
}
