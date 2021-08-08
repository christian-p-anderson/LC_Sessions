/*
    Given a non-empty array of decimal digits representing a non-negative integer, increment on to the integer. The
    digits are stored such that the most significant digit is at the head of the list, and each element in the array
    contains a single digit. You may assume the integer does not contain any leading zero except for the number 0
    itself.
 */

package Array;

public class PlusOne {
    //we need to loop through this backwards
    //if the last element is a 9 then we change the last element to 0, and increment the second to last element
    //if we end up going from 9 to 10, 99 to 100, etc. we create a new result array
        //we know that the result array will have a size that is larger by 1
        //set the first element to 1
        //return result array

    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;

            }
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }


}
