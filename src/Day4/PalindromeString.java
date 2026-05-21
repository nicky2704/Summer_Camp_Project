package Day4;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();
        
        String reversed = new StringBuilder(str).reverse().toString();

        if(str.equalsIgnoreCase(reversed)) {
            System.out.println("Is Palindrome String");
        } else {
            System.out.println("Is not palindrome string");
        }
        sc.close();
    }
}
