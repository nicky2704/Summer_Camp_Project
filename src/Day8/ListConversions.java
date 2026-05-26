package Day8;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class ListConversions {
   public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(5);
        System.out.println(list);
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(list);
        System.out.println(lhs);
        ArrayList<Integer> arr = new ArrayList<>(list);
        System.out.println(arr);
        TreeSet<Integer> ree =new TreeSet<>(list);
        System.out.println(ree);
   } 
}
