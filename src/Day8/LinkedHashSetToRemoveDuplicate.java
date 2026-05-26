package Day8;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSetToRemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<String> emd = new ArrayList<>();
        emd.add("Leo");
        emd.add("Emma");
        emd.add("Leo");
        LinkedHashSet<String> lhs = new LinkedHashSet<>(emd);
        System.out.println(lhs);
    }
}
