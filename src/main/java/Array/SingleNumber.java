/*
    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
    You must implement a solution with a linear runtime complexity and use only constant extra space.
 */

package Array;

import java.util.HashMap;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        //use a hashmap
        //key:value | Integer:Integer
        //return the key where value equals one

        HashMap<Integer, Integer> hash_table = new HashMap<>();

        for (int num : nums) {
            hash_table.put(num, hash_table.getOrDefault(num, 0) + 1);
        }

        for (int i : nums) {
            if (hash_table.get(i) == 1) {
                return i;
            }
        }

        return 0;
    }
}

/*
    Iterate through all elements in nums and setup key/value pair
    Return the element which appeared only once
 */
