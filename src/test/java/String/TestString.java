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

    @Test
    public void TestFirstUniqueChar1() {
        FirstUniqueChar firstUniqueChar = new FirstUniqueChar();

        String inputStr = "loveleetcode";
        int actual = 2;

        int result = firstUniqueChar.fistUniqChar(inputStr);

        Assert.assertEquals(actual, result);
    }

    @Test
    public void TestFirstUniqueChar2() {
        FirstUniqueChar firstUniqueChar = new FirstUniqueChar();

        String inputStr = "dadacc";
        int actual = -1;

        int result = firstUniqueChar.fistUniqChar(inputStr);

        Assert.assertEquals(actual, result);

    }

    @Test
    public void TestValidAnagram1() {
        ValidAnagram validAnagram = new ValidAnagram();

        String s = "anagram", t = "nagaram";

        boolean result = validAnagram.isAnagram(s, t);

        Assert.assertTrue(result);
    }

    @Test
    public void TestValidAnagram2() {
        ValidAnagram validAnagram = new ValidAnagram();

        String s = "rat", t = "car";

        boolean result = validAnagram.isAnagram(s, t);

        Assert.assertFalse(result);
    }

    @Test
    public void TestValidPalindrome1() {

        ValidPalindrome validPalindrome = new ValidPalindrome();

        String s = "A man, a plan, a canal: Panama";

        boolean result = validPalindrome.isPalindrome(s);

        Assert.assertTrue(result);
    }

    @Test
    public void TestValidPalindrome2() {

        ValidPalindrome validPalindrome = new ValidPalindrome();
        String s = "race a car";

        boolean result = validPalindrome.isPalindrome(s);

        Assert.assertFalse(result);
    }

    @Test
    public void TestStringToIntegerAtoi1() {
        StringToIntegerAtoi stringToIntegerAtoi = new StringToIntegerAtoi();

        String s = "42";
        int actual = 42;

        int result = stringToIntegerAtoi.myAoi(s);

        Assert.assertEquals(actual, result);
    }

    @Test
    public void TestStringToIntegerAtoi2() {
        StringToIntegerAtoi stringToIntegerAtoi = new StringToIntegerAtoi();
        String s = "-492784";
        int actual = -492784;

        int result = stringToIntegerAtoi.myAoi(s);

        Assert.assertEquals(actual, result);
    }

    @Test
    public void TestImplementstrStr1() {
        ImplemementstrStr implemementstrStr = new ImplemementstrStr();

        String haystack = "hello";
        String needle = "ll";

        int actual = 2;

        int result = implemementstrStr.strStr(haystack, needle);

        Assert.assertEquals(actual, result);
    }

    @Test
    public void TestImplementstrStr2() {
        ImplemementstrStr implemementstrStr = new ImplemementstrStr();

        String haystack = "aaaaa";
        String needle = "bba";

        int actual = -1;

        int result = implemementstrStr.strStr(haystack, needle);

        Assert.assertEquals(actual, result);
    }

    @Test
    public void TestImplementstrStr3() {
        ImplemementstrStr implemementstrStr = new ImplemementstrStr();

        String haystack = "alihdv ";
        String needle = "";

        int actual = 0;

        int result = implemementstrStr.strStr(haystack, needle);

        Assert.assertEquals(actual, result);
    }

}
