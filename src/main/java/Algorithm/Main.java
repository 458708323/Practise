package Algorithm;

import java.util.Scanner;

/**
 * @Author grail
 * @Date 18-3-21 下午9:31
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = getSum(n);
        System.out.println(sum);
    }

    private static int getSum(int n) {
        int count = 0;
        if (n == 1) {
            count = 1;//f(1) =1
        } else if (n == 2) count = 2;//f(2)=2
        else {
            for (int i = 1; i < n; i++) {
                count += getSum(n - i);//计算f(n) = f(n-1)+f(n-2)+f(n-3)+....+f(1)
            }
            count++;//再加f(0) = 1}return count;
        }
        return count;
    }

}
