package Other;

import org.junit.Assert;
import org.junit.Test;

public class TestOthers {

    @Test
    public void TestBinaryToDecimal() {
        BinaryToDecimal binaryToDecimal = new BinaryToDecimal();

        String binaryString = "1101";
        int expected = 13;

        int result = binaryToDecimal.ConvertBinaryToDecimal(binaryString);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void TestCaesarCipher() {
        CaesarCipher cc = new CaesarCipher();

        String str = "AbcD";
        int shift = 3;
        String expected = "DefG";

        String result = cc.shiftEncrypt(str, shift).toString();

        Assert.assertEquals(expected, result);
    }

    @Test
    public void TestFibonacci() {
        Fibonacci fibonacci = new Fibonacci();

        int num = 10;
        int expected = 55;

        int result = fibonacci.fib(num);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void TestConvertToCamelCase() {
        ConvertToCamelCase convertToCamelCase = new ConvertToCamelCase();

        String str = "tHe World IS bUt a STAGE";
        String expected = "theWorldIsButAStage";

        String result = convertToCamelCase.toCamelCase(str);

        Assert.assertEquals(expected, result);

    }
}
