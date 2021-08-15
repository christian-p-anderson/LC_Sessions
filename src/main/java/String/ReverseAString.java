package String;

public class ReverseAString {
    public String reverseString(char[] s) {
        //make char array into a string and use StringBuilder to reverse it
        String str = new String(s);

        StringBuilder builder = new StringBuilder();

        builder.append(str).reverse();

        return builder.toString();

    }

    //the way LeetCode wanted it
    public void stringReverse(char[] s) {
        int n = s.length;

        for (int i = 0; i < n / 2; i++) {
            char temp = s[i];
            s[i] = s[n - 1 - i];
            s[n - 1 - i] = temp;
        }
        /*
            The Hint was | The entire logic for reversing a string is based on using the opposite directional two-
            pointer approach. Based on the hint, we arrived at the code block above.
         */
    }

}
