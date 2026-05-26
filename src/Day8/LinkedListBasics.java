package Day8;

import java.util.LinkedList;

public class LinkedListBasics {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        System.out.println(list);
        list.addFirst(2);
        System.out.println(list);
        list.addLast(8);
        System.out.println(list);
        list.offer(10);
        System.out.println(list);
        list.offerFirst(1);
        System.out.println(list);
        list.offerLast(12);
        System.out.println(list);
        list.get(4);
        System.out.println(list);
        list.getFirst();
        System.out.println(list);
        list.getLast();
        System.out.println(list);
    }
}
