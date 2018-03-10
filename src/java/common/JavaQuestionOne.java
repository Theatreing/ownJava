package common;

import java.util.HashMap;
import java.util.Map;

public class JavaQuestionOne {
    public static  void main(String[] args) {

        HashMap<String, Integer> testMap = new HashMap<String, Integer>();
        for (int i = 0; i < 1000; i++) {
            testMap.put("ID_" + i, i);
        }

        //遍历HashMap：方法1
        for (String key : testMap.keySet()) {
            Integer value = testMap.get(key);
            System.out.println(key + "-------->" + value);
        }

        //遍历HashMap：方法2
        for (Map.Entry<String, Integer> entry : testMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "-------->" + value);
        }
    }

}
