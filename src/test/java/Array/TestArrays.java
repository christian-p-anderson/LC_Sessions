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

}
