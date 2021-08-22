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

        //special case
        if(needle.length() == 0) {
            return 0;
        }

        for (int i = 0; i < haystack.length(); i++) {
            //special case
            if (i + needle.length() > haystack.length()) {
                return -1;
            }

            int m = i;

            for (int j = 0; j < needle.length(); j++) {
                if(needle.charAt(j) == haystack.charAt(m)) {
                    if (j == needle.length() - 1) {
                        return i;
                    }
                    m++;
                } else {
                    break;
                }
            }

        }


        return -1;
    }

}
