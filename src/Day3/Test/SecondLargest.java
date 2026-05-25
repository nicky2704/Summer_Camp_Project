package Day3.Test;

public class SecondLargest {
    public static int solution(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > largest) {
                secLargest = largest;
                largest = arr[i];
            } else if(arr[i] < largest && arr[i] > secLargest) {
                secLargest = arr[i];
            }
        }

        return secLargest;
    }
    public static void main(String[] args) {
        int arr[] = {1,4,3,7,8};
        System.out.println(solution(arr));
    }
}
