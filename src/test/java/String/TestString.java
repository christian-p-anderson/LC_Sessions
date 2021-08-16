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
    public void TestReverseAnInteger() {
        ReverseAnInteger reverseAnInteger = new ReverseAnInteger();

        int intInput = 123;
        int actual = 321;

        int result = reverseAnInteger.reverse(intInput);

        Assert.assertEquals(actual, result);
    }
}
