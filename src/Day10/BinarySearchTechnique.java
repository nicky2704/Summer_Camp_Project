package Day10;

import java.util.*;

public class BinarySearchTechnique {
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
            Arrays.sort(arr); // Ensure the array is sorted for binary search
        int low = 0, high = n - 1;
        System.out.println("Sorted array: " + Arrays.toString(arr));
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == target) {
                System.out.println("Element found at index: " + mid);
                break;
            } else if(arr[mid] < target) {
                low ++;
            } else {
                high --;
            }
        }
        sc.close();
    }
}
