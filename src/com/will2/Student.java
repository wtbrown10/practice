package com.will2;

public class Student {
    private String name;
    private int rollNumber;
    public Boolean likeMath;
    public Boolean likeScience;

    public Student(String name, int rollNumber, Boolean likeMath, boolean likeScience) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.likeMath = likeMath;
        this.likeScience = likeScience;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

}
