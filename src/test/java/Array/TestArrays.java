package Array;

import org.junit.Assert;
import org.junit.Test;

public class TestArrays {

    @Test
    public void TestRemoveDuplicates() {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int expected = 5;

        int actual = removeDuplicates.removeDupes(nums);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void TestBuyAndSell() {
        BuyAndSell buyAndSell = new BuyAndSell();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int expected = 7;

        int actual = buyAndSell.maxProfit(prices);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestRotateArray() {
       RotateArray rotateArray = new RotateArray();
       int[] nums = {1, 2, 3, 4, 5, 6, 7};
       int k = 3;
       int[] expected = {5, 6, 7, 1, 2, 3, 4};

       int[] actual = rotateArray.rotate(nums, k);

       Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestRotateImage() {
        RotateImage rotateImage = new RotateImage();

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] expected = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };

        int[][] actual = rotateImage.rotate(matrix);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestContainsDuplicate() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = {1, 2, 4, 1, 3};
        boolean actual = containsDuplicate.containsDupe(nums);

        Assert.assertTrue(actual);
    }

    @Test
    public void TestSingleNumber() {
        SingleNumber singleNumber = new SingleNumber();
        int[] nums = {4, 1, 2, 1, 2};
        int expected = 4;

        int actual = singleNumber.singleNumber(nums);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void TestIntersectionOfTwoArrays() {
        IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] expected = {2, 2};

        int[] actual = intersectionOfTwoArrays.intersect(nums1, nums2);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestPlusOne1() {
        PlusOne plusOne = new PlusOne();

        int[] digits = {4, 3, 2, 1};
        int[] expected = {4, 3, 2, 2};

        int[] actual = plusOne.plusOne(digits);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestPlusOne2() {
        PlusOne plusOne = new PlusOne();

        int[] digits = {9, 9, 9};
        int[] expected = {1, 0, 0, 0};

        int[] actual = plusOne.plusOne(digits);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void MoveZeroes1() {
        MoveZeroes moveZeroes = new MoveZeroes();

        int[] nums = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};

        int[] actual = moveZeroes.moveZeroes(nums);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void MoveZeroes2() {
        MoveZeroes moveZeroes = new MoveZeroes();

        int[] nums = {0};
        int[] expected = {0};

        int[] actual = moveZeroes.moveZeroes(nums);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestTwoSum() {
        TwoSum twoSum = new TwoSum();

        int[] input = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};

        int[] actual = twoSum.showTwoSum(input, target);

        Assert.assertArrayEquals(expected, actual);

    }

    @Test
    public void TestValidSudoku1() {
        ValidSudoku validSudoku = new ValidSudoku();

        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        boolean actual = validSudoku.isValidSudoku(board);

        Assert.assertTrue(actual);
    }

    @Test
    public void TestValidSudoku2() {
        ValidSudoku validSudoku = new ValidSudoku();

        char[][] board = {
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        boolean actual = validSudoku.isValidSudoku(board);

        Assert.assertFalse(actual);
    }
}
