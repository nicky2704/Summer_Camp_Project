package Day2;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int res = 0;
        while(n != 0) {
            int rem = n%10;
            res = rem + (res*10);
            n = n/10;
        }
        System.out.println(res);
        sc.close();
    }
}
