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
        int reversedNum = 0;

        while (x != 0) {
            int currentDigit = x % 10;

            reversedNum = reversedNum * 10 + currentDigit;

            if ((reversedNum - currentDigit) / 10 != prevReversedNum) {
                return 0;
            }

            prevReversedNum = reversedNum;
            x = x / 10;
        }

        return negativeFlag ? -reversedNum : reversedNum;

    }


}
