package Chapter18;

public class Recursion {
    public static void main(String[] args) {
        // 5! = 5 * 4 * 3 * 2 * 1
        // 3! = 3 * 2 * 1
    }

    /**
     * Iterative Solution for Factorial
     * @param n
     * @return factorial of n
     */
    public static int factorial(int n) {
        int result = 1;
        for(int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Definition
    // f(x) = x            ( x <= 1)
    // f(x) = x * f(x-1)   ( x > 1 )
    public static int factorial_recur(int n) {
        // base case (when to stop)
        if (n == 1) {
            return 1;
        }
        // recursive case
        return n * factorial_recur(n - 1);
    }

}




