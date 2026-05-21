package Day3;

import java.util.Arrays;

public class BinarySearch {
    public static boolean solution(int arr[],int key) {

        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;
            if(key < arr[mid]) {
                start = mid;
            } else if(key > arr[mid]) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {-2,0,5,6,2,1,10};

        if(solution(arr, 2)) {
            System.out.println("Element is Found");
        } else {
            System.out.println("Element not Found");
        }   
    }
}
