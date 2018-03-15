package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 第一章习题一：如果不缺内存，如何使用一个有库的语言来实现一种排序算法以表示和排序集合
 */
public class algorithm1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrs = new int[sc.nextInt()];
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = sc.nextInt();
        }
        Arrays.sort(arrs);
        for (int arr : arrs) {
            System.out.print("-" + arr);
        }
    }
}
