package ch12.exercise.p05;

import java.util.HashSet;

public class StudentExample {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();

        Student s1 = new Student("1");
        Student s2 = new Student("1");
        Student s3 = new Student("2");

        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println(set.size());

    }
}
