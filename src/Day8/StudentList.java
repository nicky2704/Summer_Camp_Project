package Day8;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Test Cases: ");
        int t = sc.nextInt();
        for(int j = 0; j<t; j++) {
            ArrayList<Integer> arr = new ArrayList<>();
            System.out.println("Enter marks of 5 Subjects:");
            for(int i=0; i<5; i++) {
                int marks = sc.nextInt();
                arr.add(marks);
            }
            int sum = 0;
            for(int c : arr) {
                sum += c;
            }
            double avg = (double)sum/5;
            System.out.println(sum);
            System.out.println(avg);
        }
        sc.close();
    }
}
