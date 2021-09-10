package com.will2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FieldTrip {
    public static void main(String[] args) {
        List<String> grade9 = new LinkedList<String>(Arrays.asList(new String[]{"Ram", "Michael", "John", "Ron"}));
        List<String> grade10 = new LinkedList<String>(Arrays.asList(new String[]{"Harry", "Ferros", "Lita", "John"}));

//        grade9.addAll(Arrays.asList(new String[]{"Ram", "Michael", "John", "Ron"}));
//        grade10.addAll(Arrays.asList(new String[]{"Harry", "Ferros", "Lita", "John"}));

        for (int x = 0; x < grade9.size(); x++){
            for (int j = 0; j < grade10.size(); j++){
                if(grade9.get(x).contains(grade10.get(j))){
                    System.out.println("Student " + grade9.get(x) + " will not attend the trip!");
                    grade9.remove(x);
                }
            }
        }
        System.out.println(finalStudentList(grade9, grade10));

//        System.out.println("Students attending trip from grade 9");
//        for (String g: grade9) {
//            System.out.println(g);
//        }
//        System.out.println("Students attending trip from grade 10");
//        for (String g: grade10) {
//            System.out.println(g);
//        }
    }
    private static List<String> finalStudentList(List<String> a, List<String> b) {
        List<String> list = a;
        for (String student : b) {
            if (!a.contains(student)) {
                list.add(student);
            }
        }
        return list;
    }
}
