package Others;

public class Fibonacci {

    public int fib(int N) {
        //2 base cases
        if (N == 0) return 0;
        if (N == 1) return 1;

        //keeps track of the next two numbers and the sum of those 2 numbers
        int a = 0;
        int b = 1;
        int sum = a + b;

        while(N > 1) {
            sum = a + b;
            a = b;
            b = sum;

            N--;
        }
        return sum;
    }
}

/*
    this solution is linear and so it's faster than recursion
 */
