public class Fibonacci {
    static int fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a positive integer");
        }
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args)
    {
        int n = 10;
        System.out.println(fib(n));
        System.out.println("Time complexity: O(n)");
    }
}
