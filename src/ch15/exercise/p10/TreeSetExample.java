package ch15.exercise.p10;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>();
        set.add(new Student("blue", 96));
        set.add(new Student("hong", 86));
        set.add(new Student("white", 92));

        set.forEach(e -> System.out.println(e.id + ":" + e.score));
    }
}
