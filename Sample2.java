package com.ios;

import java.util.LinkedHashMap;
import java.util.Map;

public class Sample2 {
    public static void main(String[] args) {
        System.out.println(getEncodedString("wwwwwrrrsssaaa"));
    }

    private static String getEncodedString(String s) {
        String result = "";

        Map<Character, Integer> stringCounter = new LinkedHashMap<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (stringCounter.containsKey(arr[i])) {
                Integer val = stringCounter.get(arr[i]);
                val += 1;
                stringCounter.put(arr[i], val);
            } else {
                stringCounter.put(arr[i], 1);
            }
        }
        for (Map.Entry<Character, Integer> e: stringCounter.entrySet()) {
            result = result +e.getKey()+ e.getValue();
        }

        return result;
    }
}
