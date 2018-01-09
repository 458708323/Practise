package HashMap;

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
        for (Map.Entry m : map.entrySet()) {
            String string = "[" + m.getValue() + ":" + m.getKey() + "]";
            stringBuilder.append(string);
        }
        return "{" + stringBuilder.toString() + "}";
    }

    public static void main(String[] args) {
        System.out.println(printHashMap());
    }
}
