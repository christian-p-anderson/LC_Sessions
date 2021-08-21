/*
    Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s
    atoi function).

    The algorithm for myAtoi(string s) is as follows:

    - Read in and ignore any leading whitespace.
    - Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if
    it is either. This determines if the final result is negative or positive respectively. Assume the result is
    positive if neither is present.
    - Read in next the characters until the next non-digit charcter or the end of the input is reached. The rest of the
    string is ignored.
    - Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer
    is 0. Change the sign as necessary (from step 2).
    - If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it
    remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than
    231 - 1 should be clamped to 231 - 1.
    - Return the integer as the final result.

    Note:
    - Only the space character ' ' is considered a whitespace character.
    - Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
 */



package String;

public class StringToIntegerAtoi {

    public int myAoi(String s) {

        //convert string to a character array
        char[] str = s.toCharArray();

        //if there are spaces at the beginning of the string
        int i = 0;
        while(i < str.length && str[i] == ' ') {
            i++;
        }

        //if the string only contains spaces
        if ( i >= str.length) {
            return 0;
        }

        //how to deal with a '+' or '-' in the string
        int sign = 1;
        if (str[i] == '+' || str[i] == '-') {
            sign = (str[i] == '+') ? +1 : -1;
            i++;
        }

        //always checking
        if ( i >= str.length) {
            return 0;
        }

        int num = 0;
        for (i = i; i < str.length && str[i] >= '0' && str[i] <= '9' ; i++) { // want to make sure that str[i] is a number
            //and that once we finish with that number we stop

            //handle under and overflow a 32-bit integer
            if (num > Integer.MAX_VALUE / 10 ||
                    (num == Integer.MAX_VALUE / 10 && str[i] - '0' > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            num = num * 10 + Integer.parseInt(String.valueOf(str[i]));
        }
        return num * sign;
    }
}
