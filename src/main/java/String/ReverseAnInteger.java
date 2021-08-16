/*
    Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside
    the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
 */

package String;

public class ReverseAnInteger {

    public int reverse(int x) {

        //need to know when we are working with a negative int
        boolean negativeFlag = false;
        if (x < 0) {
            x = -x;
            negativeFlag = true;
        }

        int prevReversedNum = 0;
        int result = 0;

        while (x != 0) {
            int currentDigit = x % 10;

            result = result * 10 + currentDigit;

            //this deals with the constraint, "If reversing x causes the value to go outside the signed 32-bit integer
            //range [-2^31, 2^31 - 1], then return 0."
            if ((result - currentDigit) / 10 != prevReversedNum) {
                return 0;
            }

            prevReversedNum = result;
            x = x / 10;
        }
        return negativeFlag ? -result : result;
    }


}
