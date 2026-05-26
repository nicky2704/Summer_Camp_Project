package Day8;

import java.util.ArrayList;

public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(8);
        arr.add(4);
        for(Integer a :arr) {
            System.out.println(a);
        }
    }
}
