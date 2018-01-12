package HashMap;

import com.google.common.base.Joiner;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wb-zh306310 on 2018/1/9.
 */
public class PrintHashMap {
    public static String printHashMap() {
        Map<Integer, String> map = new HashMap<Integer, String>();
        for (int i = 1; i <= 1000; i++) {
            map.put(i, i + "");
        }
        return toString(map);
    }

    public static String toString(Map<Integer, String> map) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{").append(Joiner.on(";").withKeyValueSeparator("=").join(map)).append("}");
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(printHashMap());
    }
}
