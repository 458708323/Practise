package DynamicProgramming;

/**
 * @author wb-zh306310
 * @create 2018/4/8 17:01
 */

import java.util.Scanner;

/**
 * 编辑距离，又称Levenshtein距离（也叫做Edit Distance），是指两个字串之间，由一个转成另一个所需的最少编辑操作次数。许可的编辑操作包括将一个字符替换成另一个字符，插入一个字符，删除一个字符。
 * 例如将kitten一字转成sitting：
 * sitten （k->s）
 * sittin （e->i）
 * sitting （->g）
 * 所以kitten和sitting的编辑距离是3。俄罗斯科学家Vladimir Levenshtein在1965年提出这个概念。
 * 给出两个字符串a,b，求a和b的编辑距离。
 * 状态定义:F(i,j)表示第一个字符串的前i个字母和第二个字符串的前j个字母需要编辑的次数，求Fn,m，n和m分别是两个字符串的长度。
 * 状态转移方程：
 * 当F(i,j-1)=F(i-1,j)时，F(i,j)=F(i,j-1)；
 * 当F(i,j-1)！=F(i-1,j)时，F(i,j)=min{F(i-1,j-1),F(i,j-1),F(i-1,j)}+1.
 */
public class EditDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int alen = a.length();
        int blen = b.length();
        int[][] dp = new int[alen + 1][blen + 1];
        for (int i = 0; i < alen; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i < blen; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i < alen + 1; i++) {
            for (int j = 1; j < blen + 1; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
            }
        }
        System.out.println(dp[alen][blen]);
        for (int i = 0; i < alen + 1; i++) {
            for (int j = 0; j < blen + 1; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }
}
