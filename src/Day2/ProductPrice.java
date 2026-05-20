package Day2;

import java.util.Scanner;

public class ProductPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product code: ");
        int n = sc.nextInt();
        int res = 1;
        while(n != 0) {
            int digit = n%10;
            res = res*digit;
            n = n/10;
        }
        System.out.println(res);
        sc.close();
    }
}
