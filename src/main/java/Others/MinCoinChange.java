/*
    given a value V, if we want to make change for V cents, and we have an infinite supply of each of C valued coins
    what is the minimum number of coins to make the change? If it's not possible to make change, return -1.
 */


// A Dynamic Programming based Java program to find minimum of coins to make a given change V

package Others;

public class MinCoinChange {

    public static int minCoins(int coins[], int V) {
        // table[i] will be storing the minimum number of coins required for i value. So table[V] will have result
        int table[] = new int[V + 1];

        // Base case (If given value V is 0)
        table[0] = 0;

        // Initialize all table values as Infinite
        for (int i = 1; i <= V; i++)
            table[i] = Integer.MAX_VALUE;

        // Compute minimum coins required for all values from 1 to V
        for (int i = 1; i <= V; i++)
        {
            // Go through all coins smaller than i
            for (int j = 0; j < coins.length; j++)
                if (coins[j] <= i)
                {
                    int sub_res = table[i - coins[j]];
                    if (sub_res != Integer.MAX_VALUE
                            && sub_res + 1 < table[i])
                        table[i] = sub_res + 1;


                }

        }

        if(table[V]==Integer.MAX_VALUE)
            return -1;

        return table[V];

    }

}
