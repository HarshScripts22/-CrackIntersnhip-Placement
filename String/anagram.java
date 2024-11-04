
// import java.util.HashMap;
import java.util.*;

public class anagram {
    public static void main(String[] args) {
        String S1 = "aabaa";
        String S2 = "baaaaa";

        areAnagrams(S1, S2);

    }

    public static boolean areAnagrams(String s1, String s2) {

        // Your code here
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) {
                    map.remove(ch);

                }
            } else {
                return false;
            }

        }
        return map.isEmpty();
    }

}
