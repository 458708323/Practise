package Algorithm;

import java.util.Scanner;

/**
 * 第一章习题二：如何使用位逻辑运算（如与、或、位移）来实现位向量？
 * 位向量：由二进制位组成的向量
 * 如a = [01101001] 则表示{0,3,5,6}
 */
public class algorithm1_2 {
    final static int N = 10000000;//最多一千万不重复数据
    final static int BITSTEPWORD = 32;//int类型32位
    static int[] arr = new int[1 + N / BITSTEPWORD];
    final static int SHIFT = 5;
    final static int MARK = 0x1F;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        for (i = 0; i < 2; i++) {
            clr(0);
        }
    }

    public static void clr(int i) {
        arr[(i>>SHIFT)] &= ~(1<<(i&MARK));
        System.out.print(arr[(i>>SHIFT)]);
    }
}
