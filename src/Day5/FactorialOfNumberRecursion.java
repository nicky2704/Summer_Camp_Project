package Day5;

import java.util.Scanner;

public class FactorialOfNumberRecursion {
    public static int fact(int n) {
        //base case
        if(n==1) {
            return 1;
        }
        //recursive case
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        
        System.out.println(fact(n));

        sc.close();
    }
}
