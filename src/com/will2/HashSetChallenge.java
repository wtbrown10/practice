package com.will2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetChallenge {
    public static void main(String[] args) {

        Set<String> s1 = new HashSet<String>();
        s1.addAll(Arrays.asList(new String []{"Ram", "Rack", "Dhoni", "Harshad", "Modi", "Vijay", "Sonia"}));
        // either or can be used to create hashset object
        Set<String> s2 = new HashSet<String>(Arrays.asList(new String []{"Ravi", "Faisal", "Prateek", "Abhishek", "Dhoni", "Harshad", "Ram", "Aakash"}));

        Set<String> s3 = new HashSet<String>();
        s3.addAll(Arrays.asList(new String []{"Modi", "Vijay", "Dhoni", "Faisal", "Prateek", "Harshad", "Ram", "Ravi"}));

        s1.retainAll(s2);
        s1.retainAll(s3);
        System.out.println(s1);
    }
}
