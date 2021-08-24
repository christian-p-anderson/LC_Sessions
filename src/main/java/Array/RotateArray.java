/*
    Given an array, rotate the array to the right by k steps, where k is non-negative
    Input: nums =[1,2,3,4,5,6,7], k = 3
    Output: [5,6,7,1,2,3,4]
 */

package Array;

public class RotateArray {

    public int[] rotate(int[] nums, int k) {

        //k is how many numbers you are going reverse
        k = k % nums.length;
        //reverse nums from 0 to nums.length - 1 | reverses the whole array
        reverse(nums, 0, nums.length - 1);
        //reverse the first k numbers | 0 to k - 1
        reverse(nums, 0, k - 1);
        //reverse the left-over numbers | k to nums.length - 1
        reverse(nums, k, nums.length - 1);

        return nums;
    }

    public void reverse(int[] nums, int start, int end) {
        //swap things as you go through
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}

/*
    This approach is based on the fact that when we rotate the array k times, k%nk elements from the back end of the
    array come to the front and the rest of the elements from the front shift backwards.

    In this approach, we firstly reverse all the elements of the array. Then, reversing the first k elements followed
    by reversing the rest n-kn−k elements gives us the required result.

    Let n = 7n=7 and k = 3k=3.

    Original List                   : 1 2 3 4 5 6 7
    After reversing all numbers     : 7 6 5 4 3 2 1
    After reversing first k numbers : 5 6 7 4 3 2 1
    After revering last n-k numbers : 5 6 7 1 2 3 4 --> Result
 */
