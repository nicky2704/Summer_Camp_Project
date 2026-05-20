package Day2.Arrays;

public class SumOfArrayElement {
    public static void main(String[] args) {
        int arr[] = {1,6,9,3,5,7};
        int sum = 0;
        for(int i = 0; i< arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
