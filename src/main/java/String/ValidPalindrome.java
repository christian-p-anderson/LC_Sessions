/*
    Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases
 */

package String;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        //create pointers pointing to the beginning and the end of a string
        int i = 0;
        int j = s.length() - 1;

        //while there are characters to compare
        while (i < j) {

            //if there is a mismatch
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            //increment first pointer and decrement the other
            i++;
            j--;
        }

        //given string is a palindrome
        return true;
    }

}
