package com.will2;

import java.util.ArrayList;

public class School {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<Student>();
        Student s1 = new Student("Ram", 21, true, false);
        studentArrayList.add(s1);
        Student s2 = new Student("Tom", 22, true, false);
        studentArrayList.add(s2);
        Student s3 = new Student("Ravi", 23, true, true);
        studentArrayList.add(s3);
        Student s4 = new Student("Tanvi", 28, true, false);
        studentArrayList.add(s4);
        Student s5 = new Student("Vikas", 30, true, true);
        studentArrayList.add(s5);
        Student s6 = new Student("John", 19, false, true);
        studentArrayList.add(s6);
        Student s7 = new Student("Abhi", 45, false, true);
        studentArrayList.add(s7);
        Student s8 = new Student("Faisal", 15, false, true);
        studentArrayList.add(s8);

//        if(studentArrayList.remove(s1)) {
//            System.out.println("Ram has been removed");
//        }

        for (Student s: studentArrayList) {
            System.out.println(s.getName() + " - " + s.getRollNumber());
        }

        System.out.println("the Students who like both math and science:");

        for (Student s: studentArrayList) {
            if(s.likeScience && s.likeMath) {
                System.out.println(s.getName() + " - " + s.getRollNumber());
            }
        }
//        studentArrayList.set(0,s1);

//        studentArrayList.clear();
//        if(studentArrayList.isEmpty()){
//            System.out.println("School is closed down!!");
//        }

    }
}
