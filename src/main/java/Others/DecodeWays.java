package Others;

public class DecodeWays {
    public int numWaysToDecode(String s) {
        //uses bottoms-up processing

        int[] ways = new int[s.length() + 1];
        //this is a dynamic programming array
        //we're saying plus one because we want to account for the number 0 if we have no string, and we also want to
        //return really the number of ways to decode a string if it's of the length s

        ways[0] = 1; //base case - number of ways to decode a string of length 0 is 1
        ways[1] = s.charAt(0) == '0' ? 0 : 1; //base case - number of ways to decode a string of length 1 is going to
        //depend on whether it's a zero or not

        //now that we have the base cases we can iterate all the way to s' length and solve our sub-problems
        //we're going to look and evaluate the digit we're on

        for (int i = 2; i <= s.length(); i++) {
            int oneDigit = Integer.valueOf(s.substring(i - 1, i)); //getting the character we're on and turning it to an
            // Integer
            int twoDigits = Integer.valueOf(s.substring(i - 2, i)); //getting the character we're on and turning it to
            //an Integer

            //now we want to know if there is a mapping using oneDigit and twoDigits
            if (oneDigit >= 1 && oneDigit <= 9) {
                ways[i] += ways[i - 1];
            }

            if (twoDigits >= 10 && twoDigits <= 26) {
                ways[i] += ways[i - 2];
            }
        }
        return ways[s.length()];
        //our dp array stores the maximum number of ways to decode our string up till that index and our index
        //represents the number of characters we have
    }
}

/*
    Dynamic programming is the idea to simply store the results of sub-problems, so that we do not have to re-compute
    them when needed later. This simple optimization reduces time complexities from exponential to polynomial.
 */
