package com.will2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Hash {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<String>();
        s1.addAll(Arrays.asList(new String[]{"John", "Michael", "Roy"}));
        Set<String> s2 = new HashSet<String>();
        s2.addAll(Arrays.asList(new String[]{"Lita", "Tina", "Roy"}));

        // Union
        Set<String> s3 = new HashSet<>(s1);
        s3.addAll(s2);
        System.out.println("union: " + s3);

        // Intersection
        Set<String> s4 = new HashSet<>(s1);
        s4.retainAll(s2);
        System.out.println("Intersection: " + s4);

    }
}
