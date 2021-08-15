package Others;

import java.util.HashSet;

public class ContainsDupes {

    public static boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (!set.add(i)) {
                return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 3};
        if(containsDuplicate(nums)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
