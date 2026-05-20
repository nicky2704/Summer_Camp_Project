package Day2.Arrays;

public class MinMaxArray {
    public static void main(String[] args) {
        int arr[] = {10,14,27,9,19,2,7};
        int min = arr[0];
        int max = arr[0];
        for(int i = 1;i<arr.length;i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
