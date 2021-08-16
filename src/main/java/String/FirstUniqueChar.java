/*
    Given a string s, find the first non-repeating character in it and return its index. If it does not exist return
    -1.
 */

package String;

import java.util.HashMap;

public class FirstUniqueChar {

    public int fistUniqChar(String s) {
        //create a new HashMap to store the characters of the string and the frequency they appear
        HashMap<Character, Integer> map = new HashMap<>();

        int n = s.length();

        //populate the map with the characters in the string and the frequency they appear
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        //find the index in the map
        for (int i = 0; i < n; i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

}
