package Other;

import org.junit.Assert;
import org.junit.Test;

public class TestOthers {

    @Test
    public void TestConvertToCamelCase() {
        ConvertToCamelCase convertToCamelCase = new ConvertToCamelCase();

        String str = "tHe World IS bUt a STAGE";
        String expected = "theWorldIsButAStage";

        String result = convertToCamelCase.toCamelCase(str);

        Assert.assertEquals(expected, result);

    }
}
