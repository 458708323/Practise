package Algorithm;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 * n<=39
 */

/**
 * 待review
 */
public class algorithm_test7 {
    public int Fibonacci(int n) {
        if (n < 1) {
            return n;
        }
        int sum = 0;
        int sum2 = 1;
        for (int i = 1; i < n; i++) {
            int type = sum2;
            sum2 = sum + sum2;
            sum = type;
        }
        return sum2;
    }

    public static void main(String[] args) {
        algorithm_test7 test7 = new algorithm_test7();
        System.out.println(test7.Fibonacci(5));
    }
}
