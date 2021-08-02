/*
    Given an array, rotate the array to the right by k steps, where k is non-negative
    Input: nums =[1,2,3,4,5,6,7], k = 3
    Output: [5,6,7,1,2,3,4]
 */

package Array;

public class RotateArray {

    public void rotate(int[] nums, int k) {
//        int j = 0;
//
//        while (k > 0) {
//            int temp = arr[arr.length - 1];
//
//            for (j = arr.length - 1; j > 0; j--) {
//                arr[j] = arr[j -1];
//            }
//
//            arr[j] = temp;
//            k--;
//        }

        // speed up the rotation
//        k %= nums.length;
//        int temp, previous;
//        for (int i = 0; i < k; i++) {
//            previous = nums[nums.length - 1];
//            for (int j = 0; j < nums.length; j++) {
//                temp = nums[j];
//                nums[j] = previous;
//                previous = temp;
//            }
//        }


//        int[] a = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            a[(i + k) % nums.length] = nums[i];
//        }
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = a[i];
//        }



//        k = k % nums.length;
//        int count = 0;
//        for (int start = 0; count < nums.length; start++) {
//            int current = start;
//            int prev = nums[start];
//            do {
//                int next = (current + k) % nums.length;
//                int temp = nums[next];
//                nums[next] = prev;
//                prev = temp;
//                current = next;
//                count++;
//            } while (start != current);
//        }

        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
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
