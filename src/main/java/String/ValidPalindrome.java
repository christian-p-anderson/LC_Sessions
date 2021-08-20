/*
    Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases
 */

package String;

import java.util.Locale;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        //create pointers pointing to the beginning and the end of a string
        int i = 0;
        int j = s.length() - 1;

        //while there are characters to compare
        while (i < j) {

            //keep incrementing i until an alphanumeric character is reached
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            //keep decrementing i until an alphanumeric character is reached
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            //once we reach an alphanumeric character for i and j, and they haven't crossed each other and i and j
            //are not equal to each other
            if (i < j && Character.toLowerCase(s.charAt(i++)) != Character.toLowerCase(s.charAt(j--))) {
                return false;
            }

        }

        //given string is a palindrome
        return true;
    }

}
