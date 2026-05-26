package Day8;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMethods {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(8);
        s1.add(3);
        s1.add(15);
        // HashSet<Integer> s2 = new HashSet<>();
        // s2.add(7);
        // s2.add(9);
        // s2.add(3);
        // s2.add(15);
        // System.out.println(s1.containsAll(s2));
        // s1.retainAll(s2);
        // System.out.println(s1);
        // s1.addAll(s2);
        // System.out.println(s1);
        Iterator<Integer> s = s1.iterator();
        while(s.hasNext()) {
            System.out.println(s.next());
        }
    }
}
