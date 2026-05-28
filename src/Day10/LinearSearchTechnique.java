package Day10;

import java.util.Scanner;

public class LinearSearchTechnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter the target element:");
        int target = sc.nextInt();
        System.out.println("Enter the elements:");
        int arr[] = new int[n];
        for(int i = 0 ; i<n;i++)
            arr[i]=sc.nextInt();
        int idx=0;
        for(int i=0;i<n;i++){
            if(arr[i]==target) {
                idx=i;
                break;
            }
        }
        if(idx==0) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + idx);
        }
        sc.close();
    }
}
