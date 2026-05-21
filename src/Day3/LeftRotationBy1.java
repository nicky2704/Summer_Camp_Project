package Day3;

import java.util.Arrays;

public class LeftRotationBy1 {
    public static void solution(int[] arr) {
        int size = arr.length;

        //step 1: preserve k value k = 1
        int temp = arr[0];

        //step 2: move all the elements to i-th position
        for(int i = 1;i<size;i++) {
            arr[i-1] = arr[i];
        }
        //step 3: put the preserved elements at the end
        arr[size-1] = temp;
        
    }
    public static void main(String[] args) {
        int[] arr = {-2,0,5,2,7,10};
        solution(arr);
        System.out.println(Arrays.toString(arr));
    }
}
