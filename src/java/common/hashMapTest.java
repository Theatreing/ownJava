package common;

import java.util.HashMap;

public class hashMapTest {

    public  static  void main(String args[]){
        HashMap<String,Object> hashMap = null;
        //当hashMap为空时，未进行初始化，此时进行put操作会报空指针异常。
        hashMap = new HashMap<String, Object>();
        //初始化后可进行put操作。
        hashMap.put("key1","value1");

        System.out.println(hashMap);

    }

}
