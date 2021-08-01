package Array;

import org.junit.Assert;
import org.junit.Test;

public class TestArrays {

    @Test
    public void TestRemoveDuplicates() {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int expectedResult = 5;

        int result = removeDuplicates.removeDupes(nums);

        Assert.assertEquals(expectedResult, result);

    }

}
