package DynamicProgramming;

/**
 * @author wb-zh306310
 * @create 2018/4/8 17:01
 */

import java.util.Scanner;

/**
 * �༭���룬�ֳ�Levenshtein���루Ҳ����Edit Distance������ָ�����ִ�֮�䣬��һ��ת����һ����������ٱ༭������������ɵı༭����������һ���ַ��滻����һ���ַ�������һ���ַ���ɾ��һ���ַ���
 * ���罫kittenһ��ת��sitting��
 * sitten ��k->s��
 * sittin ��e->i��
 * sitting ��->g��
 * ����kitten��sitting�ı༭������3������˹��ѧ��Vladimir Levenshtein��1965�����������
 * ���������ַ���a,b����a��b�ı༭���롣
 * ״̬����:F(i,j)��ʾ��һ���ַ�����ǰi����ĸ�͵ڶ����ַ�����ǰj����ĸ��Ҫ�༭�Ĵ�������Fn,m��n��m�ֱ��������ַ����ĳ��ȡ�
 * ״̬ת�Ʒ��̣�
 * ��F(i,j-1)=F(i-1,j)ʱ��F(i,j)=F(i,j-1)��
 * ��F(i,j-1)��=F(i-1,j)ʱ��F(i,j)=min{F(i-1,j-1),F(i,j-1),F(i-1,j)}+1.
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
