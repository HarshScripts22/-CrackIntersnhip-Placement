import java.util.*;

public class printdupschar {

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        printDupls(str);

    }

    public static void printDupls(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);

            } else {
                map.put(str.charAt(i), 1);
            }

        }
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() > 1) {
                System.out.println(e.getKey() + " count is" + e.getValue());
            }

        }
    }
}