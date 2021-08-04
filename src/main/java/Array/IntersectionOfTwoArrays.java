/*
    Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must
    appear as many times as it shows in both arrays, and you may return the result in any order.
 */

package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfTwoArrays {

    public int[] intersect(int[] nums1, int[] nums2) {

        if(nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }

        //Put elements in nums1 into a HashMap
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums1) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        //Iterate the nums2 and get the result
        List<Integer> result = new ArrayList<>();

        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                int freq = map.get(num);
                freq--;
                map.put(num, freq);
            }
        }

        return listToArray(result);
    }
        //define how to convert the List of Integers back into an array of ints
        private int[] listToArray(List<Integer> listings) {
            int[] result = new int[listings.size()];
            for (int i = 0; i < listings.size(); i++) {
                result[i] = listings.get(i);
            }
            return result;
        }

}
