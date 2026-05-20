package Day2;

import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean solution(int n) {
        int temp = n;
        int count = 0;
        while(temp != 0) {
            count++;
            temp = temp / 10;
        }
        temp = n;
        double res = 0;
        while(temp != 0) {
            int digit = temp % 10;
            res = res + Math.pow(digit, count);
            temp = temp / 10;
        }
        System.out.println(res + " " + n);
        return res == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = sc.nextInt();
        boolean res= solution(n);
        if(res) {
            System.out.println("Armstrong Number!");
        } else {
            System.out.println("Not Armstrong Number!");
        }
        sc.close();
    }
}
