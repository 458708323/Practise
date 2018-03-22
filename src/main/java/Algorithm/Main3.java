package Algorithm;

/**
 * @Author grail
 * @Date 18-3-22 上午9:32
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 给出两个字符串（可能包含空格）,找出其中最长的公共连续子串,输出其长度
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        String a = scanner.next();
        String b = scanner.next();

        List<Integer> list = new ArrayList<Integer>();

        int max = 0;
        if (a.length() <= b.length()) {
            max = getMax(b, a);
        } else {
            max = getMax(a, b);
        }
        System.out.println(max);

    }

    public static int getMax(String str1, String str2) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < str1.length(); i++) {
            for (int j = i + 1; j <= str1.length(); j++) {
                if (str2.contains(str1.substring(i, j))) {
                    list.add(j - i);
                }
            }
        }
        Collections.sort(list);
        if (list.size() == 0) {
            return 0;
        }
        return list.get(list.size() - 1);
    }

}
