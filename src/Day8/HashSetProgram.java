package Day8;

import java.util.HashSet;
import java.util.LinkedList;

public class HashSetProgram {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(4);
        set.add(2);
        System.out.println(set);
        LinkedList<Integer> list = new LinkedList<>(set);
        System.out.println(list);
    }
}
