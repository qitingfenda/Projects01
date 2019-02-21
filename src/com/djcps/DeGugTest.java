package com.djcps;

import java.util.HashMap;

/**
 * @author shkstart
 * @create 2019-02-21 9:52
 */
public class DeGugTest {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }


        HashMap<String, String> map = new HashMap<>();
        map.put("name","tom");
        map.put("age","11");
        map.put("school","sss");
        map.put("bbbb","tsfdsfom");

        String age = map.get("age");
        System.out.println("age = " + age);

        map.remove("school");
        System.out.println(map);

    }

}
