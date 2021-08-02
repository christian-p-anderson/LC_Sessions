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

    @Test
    public void TestBuyAndSell() {
        BuyAndSell buyAndSell = new BuyAndSell();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int expectedResult = 7;

        int result = buyAndSell.maxProfit(prices);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void TestRotateArray() {
       RotateArray rotateArray = new RotateArray();
       int[] nums = {1, 2, 3, 4, 5, 6, 7};
       int k = 3;
       int[] expectedResult = {5, 6, 7, 1, 2, 3, 4};

       int[] result = rotateArray.rotate(nums, k);

       Assert.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void TestContainsDuplicate() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = {1, 2, 4, 1, 3};
        boolean result = containsDuplicate.containsDupe(nums);

        Assert.assertTrue(result);
    }

}
