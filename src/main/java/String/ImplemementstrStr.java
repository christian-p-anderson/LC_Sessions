/*
    Implement strStr().
    Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

    Return 0 when needle is an empty string

 */

package String;

public class ImplemementstrStr {

    public int strStr(String haystack, String needle) {
        //base condition
        if (haystack == null || needle == null) {
            return -1;
        }

        //special case
        if (needle.equals("")) {
            return 0;
        }

        int needleLength = needle.length();

        //loop through the haystack and slide the window
        for (int i = 0; i < haystack.length() - needleLength; i++) {
            //check if the substring equals to the needle
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

}
