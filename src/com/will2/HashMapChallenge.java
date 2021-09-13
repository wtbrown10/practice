package com.will2;

import java.util.HashMap;
import java.util.Map;

public class HashMapChallenge {
    public static void main(String[] args) {
        /*
        * your are given a string "aabsbvegbevsdcwdcacxwcxwdfvevcwdxcdvrvfwvccwdv"
        * remove all characters from given string which has even number frequency*/

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        String str = "aabsbvegbevsdcwdcacxwcxwdfvevcwdxcdvrvfwvccwdv";

        for (int i = 0; i < str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                Integer val = map.get(str.charAt(i)); // gets value of element at key(i)
                val += 1; // adds 1 to that element
                map.replace(str.charAt(i), val); // replaces the value at key(i) with new element
            } else {
                map.put(str.charAt(i), 1); // adds a new key: value pair
            }
        }
        for (Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " : " + m.getValue());
        }
        System.out.println("    NEW EVEN NUMBERS REMOVED    ");

        for (Map.Entry m : map.entrySet()){
            Integer frequency = (int) m.getValue();
            Character key = (char) m.getKey();
            if(!(frequency % 2 == 0)){
                System.out.println(m.getKey() + " : " + m.getValue());
            }
        }

        }

    }

