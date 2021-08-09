package Other;

public class DecodeWays {
    public int numWaysToDecode(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int[] ways = new int[s.length() + 1];
        ways[s.length()] = 1;
        ways[s.length() - 1 ] = s.charAt(s.length() - 1) > '0' ? 1:0;

        for (int i = s.length() - 2; i >=0; i--) {
            if (s.charAt(i) == '0') {
                ways[i] = 0;
            } else  {
                int temp = (s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0');
                if (temp > 26) {
                    ways[i] = ways[i + 1];
                } else {
                    ways[i] = ways[i + 1] + ways[i + 2];
                }
            }
        }
        return ways[0];
    }
}
