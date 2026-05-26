package Day8;

import java.util.HashMap;

public class BasicsOfHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Nick", 97);
        map.put("Emma", 83);
        map.put("Alex", 79);
        map.put("Nishi", 81);
        map.put("Piyush", 94);
        for(String s : map.keySet()) {
            //System.out.println(s + ":" + map.get(s)); // to print the keys and values
            //System.out.println(s); // to print only the keys
            if(map.get(s) > 95) { // to print only the keys whose values are greater than 95
                System.out.println(s);
            }
        }
    }
}
