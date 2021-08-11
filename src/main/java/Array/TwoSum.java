/*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to
    target. You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
 */

package Array;

import java.util.HashMap;

public class TwoSum {

    public int[] showTwoSum(int[] nums, int target) {

        //base case
        if (nums == null || nums.length < 2) {
            return new int[]{0, 0};
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[] {};
    }
}

/*
    Using HashMap will solve the problem in O(n) time complexity
    Initialize an empty array
    Iterate over the elements of the array
    For every element in the array -
        If the element exists in the Map, then check if it's complement (target - element) also exits in the Map or not.
        If the complement exists then return the indices of the current element and the complement.
        Otherwise, put the element in the Map, and move to the next iteration
 */
