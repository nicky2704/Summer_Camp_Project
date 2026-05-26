package Day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestCasesInArrayListMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of test cases: ");
        int t = sc.nextInt();
        for(int j = 0; j<t; j++) {
            System.out.println("Enter size of ArrayList: ");
            int size = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            System.out.println("Enter values: ");
            for(int i = 0; i<size; i++) {
                int value = sc.nextInt();
                arr.add(value);
            }
            System.out.println("Maximum Value: "+ Collections.max(arr));
        }
        sc.close();
    }
}
