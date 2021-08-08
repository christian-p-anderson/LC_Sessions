/*
    Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero
    elements. Note that you must do this in-place without making a copy of the array.
 */

package Array;

public class MoveZeroes {

    public int[] moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;

        //If the current element is not 0, then we need to append it just in front of the last non 0 element we found
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt++] = nums[i];
            }
        }

        //After the new elements, all the non-zero elements are already at the beginning of the array.
        //Then we need to fill the remaining array with 0's.
        for (int j = lastNonZeroFoundAt; j < nums.length; j++) {
            nums[j] = 0;
        }

        return nums;
    }
}
