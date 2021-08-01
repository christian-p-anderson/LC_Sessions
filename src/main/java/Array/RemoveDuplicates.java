/*
    Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique
    element appears only once. Return the number of unique items.
 */

package Array;

public class RemoveDuplicates {

    public int removeDupes(int[] nums) {
        int index = 1;

        for(int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[index++] = nums[i + 1];
            }
        }

        System.out.println(index);

        return index;
    }

}
