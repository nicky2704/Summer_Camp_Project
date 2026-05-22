package Day5;

import java.util.Scanner;

public class NaturalNumberRecursion {
    static void printNumbers(int n) {
        if(n==0) return;
        printNumbers(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        printNumbers(n);

        sc.close();

    }
}
