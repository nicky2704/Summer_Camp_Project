package Day8;

import java.util.HashMap;

public class CharactersCountInString {
    public static void main(String[] args) {
        String s = "Programming";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        //To display duplicate characters in the string
        for(char c : map.keySet()) {
            if(map.get(c) > 1) {
                System.out.println(c);
            }
        }
        System.out.println(map);
    }
}
