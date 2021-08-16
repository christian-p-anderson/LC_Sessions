package String;

import org.junit.Assert;
import org.junit.Test;

public class TestString {

    @Test
    public void TestReverseAString() {
        ReverseAString reverseAString = new ReverseAString();

        char[] input = {'C', 'h', 'r', 'i', 's'};
        String actual = "sirhC";

        String result = reverseAString.reverseString(input);

        Assert.assertEquals(actual, result);
    }

    @Test
    public void TestReverseAnInteger1() {
        ReverseAnInteger reverseAnInteger = new ReverseAnInteger();

        int intInput = 123;
        int actual = 321;

        int result = reverseAnInteger.reverse(intInput);

        Assert.assertEquals(actual, result);
    }

    @Test
    public void TestReverseAnInteger2() {
        ReverseAnInteger reverseAnInteger = new ReverseAnInteger();

        //testing to see if we can get the instance of the class ReverseAnInteger to return zero if we provide a number
        //that goes outside the signed 32-it integer range
        int intInput = 1207130587;
        int actual = 0;

        int result = reverseAnInteger.reverse(intInput);

        Assert.assertEquals(actual, result);
    }

}
