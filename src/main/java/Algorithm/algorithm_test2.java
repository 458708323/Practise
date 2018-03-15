package Algorithm;

/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class algorithm_test2 {
    public String replaceSpace(StringBuffer str) {
        return  str.toString().replace(" ","%20");
    }

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello world");
        algorithm_test2 test2 = new algorithm_test2();
        System.out.println(test2.replaceSpace(stringBuffer));
    }
}
