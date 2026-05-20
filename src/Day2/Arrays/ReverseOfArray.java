package Day2.Arrays;

public class ReverseOfArray {
    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while(left <= right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        
    }
}
