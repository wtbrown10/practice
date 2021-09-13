package com.will2;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        // use to hashMap to count how many times each letter is used in the given string
        String str = "aabbcca";
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                Integer val = map.get(str.charAt(i));
                val += 1;
                map.replace(str.charAt(i), val);
            } else {
                map.put(str.charAt(i),1);
            }
        }
        for (Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " : " + m.getValue());
        }
    }
}
