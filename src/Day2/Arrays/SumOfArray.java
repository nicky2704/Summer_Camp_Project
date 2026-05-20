package Day2.Arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int arr1[] = {3,6,2,8,5};
        int arr2[] = {8,9,4,6,2};
        int sum[] = new int[arr1.length];
        for(int i =0;i<arr1.length;i++) {
            sum[i] = arr1[i] + arr2[2];
        }
        for(int i = 0;i<sum.length;i++) {
            System.out.println(sum);
        }
    }
}
