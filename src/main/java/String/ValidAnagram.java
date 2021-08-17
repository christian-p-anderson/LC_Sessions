package String;

import java.util.Arrays;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        //get lengths of both strings
        int n1 = s.length();
        int n2 = t.length();

        //if lengths are not equal by definition you can't have an anagram
        if (n1 != n2) {
            return false;
        }

        //create a character array of each string
        char[] sCharArr = s.toCharArray();
        char[] tCharArr = t.toCharArray();

        //sort the character arrays
        Arrays.sort(sCharArr);
        Arrays.sort(tCharArr);

        //compare the sorted strings
        for (int i = 0; i < n1; i ++) {
            if (sCharArr[i] != tCharArr[i]) {
                return false;
            }
        }

        return true;
    }
}
