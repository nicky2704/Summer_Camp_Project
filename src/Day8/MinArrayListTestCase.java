package Day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinArrayListTestCase {
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
            System.out.println("Minimum value: " + Collections.min(arr));
            Collections.sort(arr);
            System.out.println("Sorted List: " + arr);
        }
        sc.close();
    }
}
