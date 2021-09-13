package com.will2;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<String, String> schoolMap = new HashMap<>();
        schoolMap.put("1", "John");
        schoolMap.put("2", "Oliver");
        schoolMap.put("3", "Micheal");

        for (Map.Entry m :schoolMap.entrySet()){
            System.out.println("Roll number: " + m.getKey() + " Name: " + m.getValue());
        }
    }
}
