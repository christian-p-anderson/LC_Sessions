/*
    write a function to find the longest common prefix string amongst an array of strings
    if there is no common prefix return an empty string ""

    Input: strs = ["flower", "flow", "flight"]
    Output: "fl"
 */


package String;

public class LongestCommonPrefix {

    public String longCommonPrefix(String[] strs) {

        //base case if the strs array is empty return an empty string
        if (strs.length == 0) {
            return "";
        }

         //set prefix to the first element of the array
        String prefix = strs[0];

        //loop from the second string on
        for (int i = 1; i < strs.length; i++) {
            //if the prefix doesn't equal the strs element, trim off letters from the prefix
            //.indexOf() returns the position of the first occurrence of specified character(s) in a string
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }
}

/*
    Set the first element in the array as the string prefix
    When we go through the rest of the element we can remove letters off of the prefix and keep reducing it until you
    reach the most common prefix
 */
