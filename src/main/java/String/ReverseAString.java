package String;

public class ReverseAString {
    public String reverseString(char[] s) {
        //make char array into a string and use StringBuilder to reverse it
        String str = new String(s);

        StringBuilder builder = new StringBuilder();

        builder.append(str).reverse();

        return builder.toString();

    }

}
