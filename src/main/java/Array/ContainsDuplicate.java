/*
    Given an integer array nums, return true if any value appears at least twice in the array, and return false if
    every element is distinct.
 */

package Array;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (Integer num: nums) {
            if(set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }
}

/*
    Big O notation is O(n)
 */
